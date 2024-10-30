package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependtOnExample {

    @Test
    public void login(){//when this failes we set condition
        Assert.assertTrue(true);//when changed to false 2nd test case should fail, it passes for
    }
    @Test
    public void login2(){//when this failes we set condition
        Assert.assertTrue(true);//when changed to false 2nd test case should fail, it passes for
    }

    @Test(dependsOnMethods = "login")
    public  void veryfyDashbord(){
        System.out.println("Dashboard is verified successfully");
    }
}
