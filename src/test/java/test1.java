import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class test1 {


    @Test
    public void testCaseOne(){
        baseURI = "https://reqres.in";
        given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200);
    }

    @Test
    public void testCaseTwo(){
        baseURI = "https://reqres.in";
        given()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data[0].id", equalTo(7))
                .body("support.url", equalTo("https://reqres.in/#support-heading"))
                .body("data.first_name", hasItems("Michael", "Lindsay","Byron"));
    }

    @Test
    public void testCaseThree(){

        Response response= get("https://reqres.in/api/users?page=2");
        int number= response.path("total_pages");
        System.out.println(number);
        String supportURL= response.path("support.url");
        System.out.println(supportURL);
        String email= response.path("data[0].email");
        System.out.println(email);
        List<String> listOfEmails= response.jsonPath().getList("data.email");
        System.out.println(listOfEmails);
        Assert.assertEquals(email,"michael.lawson@reqres.in");

        }

    }

