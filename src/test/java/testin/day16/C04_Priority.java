package testin.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class C04_Priority extends TestBaseBeforeAfter {
    /*
    Testing test methodlarini isim sirasina gore calistirir.
    eger isim siralamasinin disinda bir siralama ile calismasini isterseniz
    ozaman test methodlarina oncelik (proority) tanimlayabiliriz

    priority kucukten buyuge gore calisir
    eger bir test methoduna priority degeri atanmamissa default olarak
    priority=.0 alir
     */

    @Test(priority = -5)
    public void test1() {

        driver.get("https://www.youtube.com");
    }

    @Test(priority = -2)
    public void test2() {
        driver.get("https://www.amazon.com");

    }

    @Test(groups = {"grup1", "grup2"})
    public void test3() {
        driver.get("http://www.hepsiburada.com");
    }
}

