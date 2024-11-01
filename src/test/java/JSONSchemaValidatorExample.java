import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;

public class JSONSchemaValidatorExample {

    @Test
    public void SchemaValidatorExampleGETrequest(){
        baseURI="https://petstore.swagger.io/v2";
        Response response= RestAssured.given()
                .when()
                .get("/pet/88888");

        response.prettyPrint();
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("json-schema-example.json"));


    }
}


