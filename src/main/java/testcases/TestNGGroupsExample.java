package testcases;

import org.testng.annotations.Test;

public class TestNGGroupsExample {


    @Test(groups="smokeTets")
    public void verifyLogin(){
        System.out.println("Verify login");
    }

    @Test(groups="smokeTets")
    public void verifySignOut(){
        System.out.println("Verify Sign out");
    }

    @Test(groups="regression")
    public void verifyDashboard(){
        System.out.println("Verify Dashboard");
    }
}
