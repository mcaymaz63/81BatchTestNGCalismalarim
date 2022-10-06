package testin.day21;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C03_ScreenShotResubleMethod {
    @Test
    public void test01() throws IOException {

        // amazon sayfasina gidip foto cekin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");

        Driver.getDriver().navigate().refresh();

        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        ReusableMethods.getScreenshot("facebook");
        Driver.closeDriver();



    }
}
