package Glue;

import com.ea.Depot;
import cucumber.api.PendingException;
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

public class PNP_26237Glue implements En {
    HttpResponse httpResponse = null;
    String serviceResponse = null;
    String translationURL = Depot.translationURL;
    String decipheringURL = Depot.decipheringURL;


    private static final Logger LOGGER = LoggerFactory.getLogger(API_GitGlue.class);

    private static HashMap<String, String> postdataTranList = new HashMap<String, String>();
    private static HashMap<String, String> postdataDecList = new HashMap<String, String>();
    private static HashMap<String, String> responseList = new HashMap<String, String>();



    public PNP_26237Glue() {

        postdataTranList.put("save-rescue-config-t","TestData/PNP_26237_t.json");
        postdataDecList.put("save-rescue-config-d","TestData/PNP_26237_d.json");
        postdataDecList.put("save-rescue-config-d-er","TestData/PNP_26237_dEr.json");

        responseList.put("tResp","ResponseData/PNP_26237_RespT.json");
        responseList.put("dResp","ResponseData/PNP_26237_RespD.json");
        responseList.put("dErResp","ResponseData/PNP_26237_RespDEr.json");



        When("^I post (.*) to translation service$", (String name) -> {
            httpResponse = Request.Post(translationURL)
                    .bodyString(new UtilMethods().getFile(postdataTranList.get(name)),
                            ContentType.APPLICATION_JSON).execute().returnResponse();
        });
        When("^I post (.*) to deciphering service$", (String name) -> {
            httpResponse = Request.Post(decipheringURL)
                    .bodyString(new UtilMethods().getFile(postdataDecList.get(name)),
                            ContentType.APPLICATION_JSON).execute().returnResponse();
        });
        Then("^I get back (.*) and HTTP (.*)$", (String respone,String code) -> {
            StringWriter stringWriter = new StringWriter();
            IOUtils.copy(httpResponse.getEntity().getContent(), stringWriter);
            serviceResponse = stringWriter.toString();
            LOGGER.info(serviceResponse);
            Assert.assertEquals(Integer.parseInt(code), httpResponse.getStatusLine().getStatusCode());
            if (code.equals("200")) {
                JSONAssert.assertEquals(serviceResponse, new UtilMethods().getFile(responseList.get(respone)), false);
            }
        });
    }
}
