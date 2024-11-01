import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

public class PUTrequest {


    @Test
    public void homeWork2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 16789);
        requestBody.put("name", "s12uperstar-option2");
        baseURI = "https://petstore.swagger.io";


        Response response = RestAssured.given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .when()
                .put("/v2/pet");


            response.prettyPrint();
    }
}