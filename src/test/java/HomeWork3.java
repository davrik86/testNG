import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

public class HomeWork3 {


    /**
     * Testcase 1:
     *  Perform a POST request to upload/create a new  PET
     * Verify the status code is 200
     * Verify the pet name match your request body input
     */
    /**
     * Testcase 2:
     * Perform a PUT request to update a pet with existing ID
     * Verify the status code is 200
     * Verify the new updated pet name your request body input
     */

    @Test
    public void Test1(){
        String name="Mylove";
        int idNumber=198602;
        JSONObject requestBody= new JSONObject();
        requestBody.put("name", name );
        requestBody.put("id", idNumber);
        baseURI = "https://petstore.swagger.io";

        Response response= RestAssured.given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .when()
                .post("/v2/pet");

        response.then().body("id", Matchers.equalTo (idNumber));
        response.then().body("name", Matchers.equalTo (name));
        response.then().statusCode(200);


    }
}
