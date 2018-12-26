package Glue;


import com.ea.Depot;
import cucumber.api.java8.En;
import groovy.beans.PropertyReader;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.junit.Assert;
import org.skyscreamer.jsonassert.JSONAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.UtilMethods;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

public class API_testGlue implements En,Depot {

    HttpResponse httpResponse = null;
    String serviceResponse = null;
    String url = Depot.ServerUrl;
    private static final Logger LOGGER = LoggerFactory.getLogger(API_testGlue.class);

    private static HashMap<String, String> postdataList = new HashMap<String, String>();
    private static HashMap<String, String> responseList = new HashMap<String, String>();

    public API_testGlue(){
        postdataList.put("Rule1","/src/test/resources/TestData/testData1.json");
        postdataList.put("Rule2","/src/test/resources/TestData/testData2.json");

        responseList.put("Rule1","/src/test/resources/ResponseData/ResponseData1.json");
        responseList.put("Rule2","/src/test/resources/ResponseData/ResponseData2.json");

        When("I send request with (.*) to the service", (String name) -> {
          httpResponse = Request.Post(url)
            .bodyString(new UtilMethods().getFile(postdataList.get(name)),
                    ContentType.APPLICATION_JSON).execute().returnResponse();
        });

        Then("I should get status (.*) and (.*)", (String code, String name) -> {
            StringWriter stringWriter = new StringWriter();
            try{
                IOUtils.copy(httpResponse.getEntity().getContent(), stringWriter);
            } catch (IOException e) {
                e.printStackTrace();
                Assert.assertEquals(Integer.parseInt(code), httpResponse.getStatusLine().getStatusCode());
            }
            serviceResponse = stringWriter.toString();
            LOGGER.info(serviceResponse);
            Assert.assertEquals(Integer.parseInt(code), httpResponse.getStatusLine().getStatusCode());
            if (code.equals("200")) {
                JSONAssert.assertEquals(new UtilMethods().getFile(responseList.get(name)), serviceResponse, false);
            }
        });






    }
}
