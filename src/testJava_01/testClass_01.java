package testJava_01;

import org.testng.annotations.*;

public class testClass_01 {

    @BeforeSuite
    public void BeforeSuiteTest() {
        System.out.println("BeforeSuiteTest");
    }

    @BeforeTest
    public void BeforeTestTest() {
        System.out.println("BeforeTest-Test");
    }

    @BeforeClass
    public void BeforeClassTest() {
        System.out.println("BeforeClassTest");
    }

    @BeforeMethod
    public void BeforeMethodTest() {
        System.out.println("BeforeMethodTest");
    }

    @Test
    public void test_01() {
        System.out.println("######test_01######");
    }

    @Test
    public void test_02() {
        System.out.println("######test_02######");
    }

    @AfterMethod
    public void AfterMethodTest() {
        System.out.println("AfterMethodTest");
    }

    @AfterSuite
    public void AfterSuiteTest() {
        System.out.println("AfterSuiteTest");
    }

    @AfterTest
    public void AfterTestTest() {
        System.out.println("AfterTestTest");
    }

    @AfterSuite
    public void AfterClassTest() {
        System.out.println("AfterClassTest");
    }

}