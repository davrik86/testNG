import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

public class PetStoreHomeWork {
    Map<String, Object> petInfo= new HashMap<>();
    String petName="tuman";
    int ID=23234;
    String endpoint="/v2/pet";
@Test
    public void CreatePet(){
    baseURI ="https://petstore.swagger.io/#";


    petInfo.put("name", petName);
    petInfo.put("id",ID);
    Response response= RestAssured.given()
            .contentType("application/json")
            .accept("application/json")
            .when()
            .body(petInfo)
            .post(endpoint);
    response.prettyPrint();
    response.then().statusCode(200);
    response.then().body("name", equalTo(petName));
    response.then().body("id", equalTo(ID));


    }

@Test
    public  void PutRequest(){
    baseURI ="https://petstore.swagger.io/#";
    petInfo.put("name","Newname");
    petInfo.put("id",ID);

    Response response = RestAssured.given()
            .contentType("application/json")
            .body(petInfo)
            .when()
            .put("/v2/pet");


    response.prettyPrint();
    response.then().statusCode(200);
    response.then().body("id",equalTo(ID));
    response.then().body("name",equalTo("Newname"));

}
}
