package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.virtualauthenticator.Credential;
import org.testng.annotations.Test;


public class Calculator {

    @Test
    public void calculatorTest(){
        System.out.println("1st test");
    }

    @Test
    public void test2(){
        System.out.println("2nd test");
    }

    @Test
    public void LoginwithValidCredential(){
        WebDriver driver= new ChromeDriver();
        driver.get("");
        WebElement username= driver.findElement(By.xpath(""));
    }

}
