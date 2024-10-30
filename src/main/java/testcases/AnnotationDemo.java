package testcases;

import org.testng.annotations.*;

public class AnnotationDemo {

    @Test
    void test(){
        System.out.println("@ Test annotation for test1");
    }

    @Test
    void test2(){
        System.out.println("@ Test annotation for test2");
    }


    @BeforeMethod
    void beforeMethod(){
        System.out.println("@ Before Method annotaiton");
    }

    @AfterMethod
    void aftereMethod(){
        System.out.println("@ After Method annotaiton");
    }



    @BeforeClass
    void beforeClass(){
        System.out.println("@ Before Class annotaiton");
    }

    @AfterClass
    void aftereClass(){
        System.out.println("@ After Class annotaiton");
    }
}
