import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

public class Homework2 {

    /**
     * URL :https://petstore.swagger.io/#/
     * Testcase 1:
     * Perform a POST request to upload a PET
     * Verify the status code is 200
     * Verify the content type is application.json
     * Verify the pet name and status match your request body input
     */

    @Test
    public void homeWork2(){
        JSONObject requestBody= new JSONObject();
        requestBody.put("id", 16789);
        requestBody.put("name", "s12uperstar");
        baseURI = "https://petstore.swagger.io";


        Response response= RestAssured.given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .when()
                .post("/v2/pet");

        response.then().statusCode(200);
//        response.then().contentType("application/json");
        response.then().body("name", equalTo("s12uperstar"));
        response.then().body("status", equalTo("available"));


    }
}
