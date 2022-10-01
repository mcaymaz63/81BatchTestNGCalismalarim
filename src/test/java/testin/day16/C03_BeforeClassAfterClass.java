package testin.day16;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class C03_BeforeClassAfterClass extends TestBaseBeforeAfter {

    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("before Class");
    }
        @AfterClass
        public void afterClassMethod() {
            System.out.println("after Class");



    }
    @Test
    public void test2() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void test1() {
        driver.get("http://www.hepsiburada.com");
        System.out.println(driver.getCurrentUrl());
    }
}

