package testin.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_YeniDriverIlkClass {

    @Test(groups = "grup1")
    public void test01() {

        Driver.getDriver().get("https://www.amazon.com");
        Driver.closeDriver();
        Driver.getDriver().get("http://www.bestbuy.com");
        Driver.getDriver().get("http://www.facabook.com");

        Driver.closeDriver();


    }
}
