import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Homework {

    /**
     * Testcase 1:
     * Perform a GET request to find a pet with id 22112
     * Verify the status code is 200
     * Verify the content type is application.json
     * Verify the pet name is booboo status is available
     */

    @Test
    public void testCaseOne(){
        baseURI = "https://petstore3.swagger.io";
        given()
                .contentType("application/json")//this is optional
                .when()//this is optional
                .get("/api/v3/pet/22112")
                .then()
                .statusCode(200)
                .body("name", equalTo("booboo"))
                .body("status", equalTo("available"));

    }

    @Test
    public void testCaseOne1(){
        Response response= RestAssured.get("https://petstore.swagger.io/v2/pet/22112");
        response.then().statusCode(200);
        response.then().contentType("application/json");
        response.then().body("name", Matchers.equalTo("booboo"));
    }

    /**
     * Testcase 2:
     * Perform a GET request to find a pet with 201029
     * Verify the status code is 404 and content type is application.json
     * Verify message is Pet not found
     */

    @Test
    public void testCaseTwo() {
        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/201029");
        Assert.assertEquals(response.getStatusCode(), 404);
        System.out.println("Content type " + response.getContentType());
        Assert.assertEquals(response.getContentType(), "application/json");
        System.out.println("this is response body " + response.getBody().asString());
        Assert.assertEquals(response.jsonPath().getString("message"), ("Pet not found"));
    }
    @Test
    public void testcaseTwo2(){
        baseURI="https://petstore.swagger.io";
        given()

                .get("/v2/pet/201029")
                .then()
                .statusCode( 404)
                .contentType("application/json")
                .body("message", equalTo("Pet not found"));


    }
}
