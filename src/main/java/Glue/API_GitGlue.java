package Glue;

import com.ea.Depot;
import cucumber.api.java8.En;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.UtilMethods;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

public class API_GitGlue implements En,Depot {
    HttpResponse httpResponse = null;
    String serviceResponse = null;
    String url = Depot.ServerUrl2;
    private static final Logger LOGGER = LoggerFactory.getLogger(API_GitGlue.class);

    private static HashMap<String, String> postdataList = new HashMap<String, String>();
    private static HashMap<String, String> responseList = new HashMap<String, String>();

    public API_GitGlue() {
        postdataList.put("repos", "ResponseData/ResponseDataGit.json");

        responseList.put("repos", "TestData/testDataGit.json");

        When("^I Send (.*) to the github service$", (String name) -> {
            httpResponse = Request.Post(url)
                    .bodyString(new UtilMethods().getFile(postdataList.get(name)),
                            ContentType.APPLICATION_JSON).execute().returnResponse();
        });

        Then("^I should get (.*) and response from (.*)$", (String code, String name) -> {
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
           // if (code.equals("200")) {
              //  JSONAssert.assertEquals(new UtilMethods().getFile(responseList.get(name)), serviceResponse, false);
           // }
        });
    }
}