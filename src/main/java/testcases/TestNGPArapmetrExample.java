package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPArapmetrExample {

    @Test
    @Parameters({"fName","LName"})
    public void demoTets(String firstname, String Lastname){
        System.out.println(firstname);
        System.out.println(Lastname);
    }
}
