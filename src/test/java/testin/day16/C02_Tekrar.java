package testin.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class C02_Tekrar extends TestBaseBeforeAfter {

    @Test
    public void test1() {

        driver.get("https://www.youtube.com");
    }

    @Test
    public void test2() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void test3() {
        driver.get("http://www.hepsiburada.com");
    }
}
