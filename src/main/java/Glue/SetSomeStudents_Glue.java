package Glue;

import com.ea.Depot;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.skyscreamer.jsonassert.JSONAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.UtilMethods;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;

public class SetSomeStudents_Glue implements En {
    HttpResponse httpResponse = null;
    String serviceResponse = null;
    String studentUrl = Depot.ServerStudentUrl;
    private static final Logger LOGGER = LoggerFactory.getLogger(SetSomeStudents_Glue.class);

    private static HashMap<String, String> postdataAddList = new HashMap<String, String>();
    private static HashMap<String, String> postdataDeleteList = new HashMap<String, String>();
    private static HashMap<String, String> postdataPutList = new HashMap<String, String>();

    private static HashMap<String, String> responseDeleteList = new HashMap<String, String>();
    private static HashMap<String, String> responsePutList = new HashMap<String, String>();



    public SetSomeStudents_Glue() {

        postdataAddList.put("add","TestData/studentAdd.json");
        postdataDeleteList.put("deleteFirst","TestData/studentDelete.json");
        postdataPutList.put("change","TestData/studentPut.json");

        When("^I (.*) some students$", (String name) -> {
            httpResponse = Request.Post(studentUrl)
                    .bodyString(new UtilMethods().getFile(postdataAddList.get(name)),
                    ContentType.APPLICATION_JSON).execute().returnResponse();
        });

        When("^I (.*) first students$", (String name) -> {
            httpResponse = Request.Delete(studentUrl+"/1").execute().returnResponse();
        });

        When("^I (.*) second students$", (String name) -> {
            httpResponse = Request.Put(studentUrl)
                    .bodyString(new UtilMethods().getFile(postdataPutList.get(name)),
                            ContentType.APPLICATION_JSON).execute().returnResponse();
        });

        Then("^I should get success status (.*)", (String code) -> {
            StringWriter stringWriter = new StringWriter();
            try{
                IOUtils.copy(httpResponse.getEntity().getContent(), stringWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }
            code = "200";
            LOGGER.info(serviceResponse);
            Assert.assertEquals(code,"200");
        });
    }
}
