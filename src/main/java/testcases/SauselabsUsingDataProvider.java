package testcases;

import Utilities.excelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauselabsUsingDataProvider {
    @Test(dataProvider ="data-provider-login" )
    public void Login(String username, String pass) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));

        userName.sendKeys(username);
        password.sendKeys(pass);
        loginButton.click();
        Thread.sleep(4000);

        driver.quit();

    }
    @DataProvider(name = "data-provider-login")
    public Object[][] loginDataProvider(){
        excelUtils.getExcelInstance("ExcelDataSet/data.xlsx","Sheet1");
        Object[][] myUsernamePassword=excelUtils.getDataSet();
        return myUsernamePassword;
    }
}
