package Glue;

import com.ea.Depot;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import jdk.nashorn.internal.ir.RuntimeNode;
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

public class SetSomeStudents_Glue implements En {
    HttpResponse httpResponse = null;
    String serviceResponse = null;
    String studentUrl = Depot.ServerStudentUrl;
    private static final Logger LOGGER = LoggerFactory.getLogger(API_GitGlue.class);

    private static HashMap<String, String> postdataAddList = new HashMap<String, String>();
    private static HashMap<String, String> postdataDeleteList = new HashMap<String, String>();
    private static HashMap<String, String> postdataPutList = new HashMap<String, String>();

    private static HashMap<String, String> responseAddList = new HashMap<String, String>();
    private static HashMap<String, String> responseDeleteList = new HashMap<String, String>();
    private static HashMap<String, String> responsePutList = new HashMap<String, String>();



    public SetSomeStudents_Glue() {

        postdataAddList.put("add2","TestData/studentAdd.json");
        postdataDeleteList.put("deleteFirst","TestData/studentDelete.json");
        postdataPutList.put("putSecond","TestData/studentPut.json");

        responseAddList.put("sixStudents","ResponseData/studentListAdd.json");
        responseDeleteList.put("fiveStudent","ResponseData/studentListDelete");
        responsePutList.put("secondUpdate","ResponseData/studentListPut");


        When("^I add some students (.*)$", (String name) -> {
            httpResponse = Request.Post(studentUrl)
                    .bodyString(new UtilMethods().getFile(postdataAddList.get(name)),
                    ContentType.APPLICATION_JSON).execute().returnResponse();
        });

        Then("^I should get new list (.*) after adding$", (String name) -> {
            StringWriter stringWriter = new StringWriter();
            try{
                IOUtils.copy(httpResponse.getEntity().getContent(), stringWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }
            serviceResponse = stringWriter.toString();
            LOGGER.info(serviceResponse);
              JSONAssert.assertEquals(new UtilMethods().getFile(responseAddList.get(name)), serviceResponse, false);
        });




//        When("^I want delete some (.*)$", (String name) -> {
//            httpResponse = Request.Post(url+"/1")
//                    .bodyString(new UtilMethods().getFile(postdataList.get(name)),
//                            ContentType.APPLICATION_JSON).execute().returnResponse();
//        });



    }
}
