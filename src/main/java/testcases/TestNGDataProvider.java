package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

    @DataProvider(name = "data-provider-example")
    public String[] dataProvider() {
        String[] username = {"PrimeUSer", "preime123", "moreusername", "andmoreuser"};
        return username;
    }

    @Test(dataProvider = "data-provider-example")
    public void myTest(String username) {
        System.out.println(username);
    }

    //option2
    @DataProvider()
    public String[] dataProvider1() {
        String[] username = {"2PrimeUSer", "2preime123", "2moreusername", "2andmoreuser"};
        return username;
    }

    @Test(dataProvider = "dataProvider1")
    public void myTest1(String username) {
        System.out.println(username);
    }
//    Example 2
    @DataProvider(name="data-provider-username-password")
    public Object[][] dataProvider2(){
        Object[][] usernameAndPAssword={{"primetech","primepassword",23},{"preime2","primepassword2",38}} ;
        return usernameAndPAssword;
    }

    @Test(dataProvider = "data-provider-username-password")
    public void loginUSingUsernamePassword(String username, String password, int age) {
        System.out.println("username is "+username);
        System.out.println("password is "+password);
        System.out.println("the age is " +age);
    }

    @DataProvider(name="data-provider-calculator")
    public Object[][] dataProviderCalculator(){
        Object[][] number={{3,3},{4,5},{6,8},{10,15}};
                return number;
    }
    @Test(dataProvider = "data-provider-calculator")
    public void calculator(int number1, int number2){
        int total= number1+number2;
        System.out.println("The total of adding "+ number1+ " and "+ number2+ " is "+ total );
    }



}