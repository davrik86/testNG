package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Chalange {
    @Test
    void veryfyLabelInMAinPage() throws InterruptedException {




            /**
             * Go to sauce Labs
             * Login
             * Verify that {Sauce Labs Backpack}  equal to {Sauce Labs}    --> Should fail
             * Verify that {Sauce Labs Bike Light}  equal {Sauce Labs Bike Light}  --> Should pass
             *
             * -- Use Soft Assert
             */



                String expectedBackpack="Sauce Labs Backpack";
                String expectedLight="Sauce Labs Bike Light";

                WebDriver driver = new ChromeDriver();
                driver.get("https://www.saucedemo.com/");
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
                driver.findElement(By.xpath("//input[@id='login-button']")).click();
                Thread.sleep(5000);

                //find actualBackPackLabel and assert it against the AC value
               String expectedBackpackLabel = "Sauce Labs";
               String actualLabelBacjkpack =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
               String actualLabellight =driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText();

                SoftAssert softAssert= new SoftAssert();
                softAssert.assertEquals(expectedBackpack,actualLabelBacjkpack, "expected text Sauce Labs Backpack");
                softAssert.assertEquals(expectedLight,actualLabellight, "expected text Sauce Labs Bike Light");

                softAssert.assertAll();//put at the end of the end of soft assert

                driver.close();

            }

        }



