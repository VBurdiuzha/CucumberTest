package Glue;

import com.ea.Depot;
import cucumber.api.java8.En;
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

public class TD24115Glue implements En,Depot {
    HttpResponse httpResponse = null;
    private String serviceResponse = null;
    private String translationURL = Depot.translationURL;
    private String decipheringURL = Depot.decipheringURL;
    private static final Logger LOGGER = LoggerFactory.getLogger(TD24115Glue.class);

    private static HashMap<String, String> postdataTranList = new HashMap<String, String>();
    private static HashMap<String, String> postdataDecList = new HashMap<String, String>();
    private static HashMap<String, String> responseTList = new HashMap<String, String>();
    private static HashMap<String, String> responseDList = new HashMap<String, String>();




    public TD24115Glue() {

        postdataTranList.put("payload","TestData/TestDataT24115.json");
        postdataDecList.put("commands","TestData/TestDataD24115.json");

        responseTList.put("TR24115","ResponseData/ResponseT24115.json");
        responseDList.put("DR24115","ResponseData/ResponseD24115.json");



        When("^I post (.*) to translation service!$", (String name) -> {
            httpResponse = Request.Post(translationURL)
                    .bodyString(new UtilMethods().getFile(postdataTranList.get(name)),
                            ContentType.APPLICATION_JSON).execute().returnResponse();
        });
        When("^I post (.*) to deciphering service!$", (String name) -> {
            httpResponse = Request.Post(decipheringURL)
                    .bodyString(new UtilMethods().getFile(postdataDecList.get(name)),
                            ContentType.APPLICATION_JSON).execute().returnResponse();
        });

        Then("^I get back (.*) and HTTP (.*) from translation service!$", (String response,String code) -> {
            StringWriter stringWriter = new StringWriter();
            IOUtils.copy(httpResponse.getEntity().getContent(), stringWriter);
            serviceResponse = stringWriter.toString();
            LOGGER.info(serviceResponse);
            Assert.assertEquals(Integer.parseInt(code), httpResponse.getStatusLine().getStatusCode());
            if(code.equals("200"))  {
                JSONAssert.assertEquals(serviceResponse, new UtilMethods().getFile(responseTList.get(response)), false);
            }
        });

        Then("^I get back (.*) and HTTP (.*) from deciphering service!$", (String response,String code) -> {
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
//              JSONAssert.assertEquals(new UtilMethods().getFile(responseDList.get(response)), serviceResponse, false);
             }
        });
    }
}
