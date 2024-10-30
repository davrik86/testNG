package testcases;

import org.testng.annotations.Test;

public class testNGPriorities {

    @Test(priority = -9)
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test(priority = -100)
    public void abc(){//this runs because of alphabetical order
        System.out.println("This is test 2");
    }

    @Test(priority = 300)
    public void test3(){
        System.out.println("This is test 3");
    }
}
