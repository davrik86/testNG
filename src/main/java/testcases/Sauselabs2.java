package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sauselabs2 {
    @Test
    public void Login() throws InterruptedException {

        String expected= "Products";
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
        Thread.sleep(2000);
        WebElement labelvalid= driver.findElement(By.xpath("//span[text()='Products']"));
        String actual=labelvalid.getText();
        Assert.assertEquals(actual,expected);

        driver.quit();

    }
}
