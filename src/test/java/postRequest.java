import io.restassured.RestAssured;

import io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class postRequest {

    @Test
    public void testCaseOptionOne() {
        //Option 1 using the body as JSON string
        RestAssured.baseURI = "https://reqres.in";//this coudl be just baseURI

        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";//this is starts with "" and json body will be inserted between them

        Response response = RestAssured.given()
                .header("ContentType", "application/jsom") //optional
                .body(requestBody)
                .when()
                .post("/api/users");//endpoint to show where we are creating

        response.then().statusCode(201);
        response.prettyPrint();

    }

    @Test
    public void testCaseOptionTwo() {
        //Option 1 using the body as JSON string
        RestAssured.baseURI = "https://reqres.in";//this coudl be just baseURI

//        String requestBody="{\n" +
//                "    \"name\": \"morpheus\",\n" +
//                "    \"job\": \"leader\"\n" +
//                "}";//this is starts with "" and json body will be inserted between them


        //the option with MAP
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Prime");
        requestBody.put("job", "school");



        /**
         * Serialization --> process of converting data Object (JSON, Java object) into a format
         * that could be easely transmitted
         * Deserialization  -->  The reverse process of serialization, it involves converting data like json or
         * xml back into java object
         */

        Response response = RestAssured.given()
                .header("ContentType", "application/jsom") //optional
                .body(requestBody)
                .when()
                .post("/api/users");//endpoint to show where we are creating

        response.then().statusCode(201);

        response.prettyPrint();
    }

}