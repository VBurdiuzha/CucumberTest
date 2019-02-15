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
import java.io.StringWriter;
import java.util.HashMap;

public class TD24130Glue implements En,Depot {
    HttpResponse httpResponse = null;
    private String serviceResponse = null;
    private String translationURL = Depot.translationURL;
    private String decipheringURL = Depot.decipheringURL;
    private static final Logger LOGGER = LoggerFactory.getLogger(TD24130Glue.class);

    private static HashMap<String, String> postdataTranList = new HashMap<String, String>();
    private static HashMap<String, String> postdataDecList = new HashMap<String, String>();
    private static HashMap<String, String> responseTList = new HashMap<String, String>();
    private static HashMap<String, String> responseDList = new HashMap<String, String>();




    public TD24130Glue() {

        postdataTranList.put("payload","TestData/24130T.json");
        postdataDecList.put("commands","TestData/24130D.json");

        responseTList.put("tResp","ResponseData/24130RT.json");
        responseDList.put("dResp","ResponseData/24130RD.json");



        When("^I post (.*) to translation service !$", (String name) -> {
            httpResponse = Request.Post(translationURL)
                    .bodyString(new UtilMethods().getFile(postdataTranList.get(name)),
                            ContentType.APPLICATION_JSON).execute().returnResponse();
        });
        When("^I post (.*) to deciphering service !$", (String name) -> {
            httpResponse = Request.Post(decipheringURL)
                    .bodyString(new UtilMethods().getFile(postdataDecList.get(name)),
                            ContentType.APPLICATION_JSON).execute().returnResponse();
        });

        Then("^I get back (.*) and HTTP (.*) from translation service !$", (String response,String code) -> {
            StringWriter stringWriter = new StringWriter();
            IOUtils.copy(httpResponse.getEntity().getContent(), stringWriter);
            serviceResponse = stringWriter.toString();
            LOGGER.info(serviceResponse);
            Assert.assertEquals(Integer.parseInt(code), httpResponse.getStatusLine().getStatusCode());
            if (code.equals("200")) {
                JSONAssert.assertEquals(serviceResponse, new UtilMethods().getFile(responseTList.get(response)), false);
            }
        });

        Then("^I get back (.*) and HTTP (.*) from deciphering service !$", (String response,String code) -> {
            StringWriter stringWriter = new StringWriter();
            IOUtils.copy(httpResponse.getEntity().getContent(), stringWriter);
            serviceResponse = stringWriter.toString();
            LOGGER.info(serviceResponse);
            Assert.assertEquals(Integer.parseInt(code), httpResponse.getStatusLine().getStatusCode());
            if (code.equals("200")) {
                JSONAssert.assertEquals(serviceResponse, new UtilMethods().getFile(responseDList.get(response)), false);
            }
        });
    }
}
