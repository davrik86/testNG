import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class Example2 {



    @Test
    public void demoOne(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println("============================");
        System.out.println(response.getHeader("content-type"));
        System.out.println("============================");
        System.out.println(response.getBody().prettyPrint());

        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test
    public void demoTwo(){
        Response response= get("https://www.google.com");
        System.out.println(response.getBody().prettyPrint());
    }
    @Test
    public void demoThree(){
        Response response= get("https://www.google.com");
        System.out.println(response.getBody().prettyPrint());
    }
}
