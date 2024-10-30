package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardandSoftAsserts {

    @Test
    public void hardAssertExample(){/**
     If assertion fails, then the rest of teh code won't get executed

    */
        //Verification number 1
        Assert.assertTrue(4==3);
        //Verification number2
        System.out.println("this line will not execute of previous condition is field");
        Assert.assertTrue(6>4);//true statement should pass
    }

    @Test
    public void softAssertExample(){/**
     Soft assert
     */
        SoftAssert softAssert= new SoftAssert();
        //Verification number 1
        softAssert.assertTrue(4==3, "verifying that 4=3");
        //Verification number2
        System.out.println("this line will print regardless of previous condition is field");
        softAssert.assertEquals("prime", "PrimeTech", "Veryfying that both text are matching");//true statement should pass

        softAssert.assertAll();
    }

}
