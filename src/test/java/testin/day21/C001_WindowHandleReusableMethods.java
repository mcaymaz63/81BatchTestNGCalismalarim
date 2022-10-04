package testin.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class C001_WindowHandleReusableMethods {
    @Test
    public void test01() {
        // https://www.internet.herokuapp.com/windows
        Driver.getDriver().get(" https://the-internet.herokuapp.com/windows ");

        String ilkSayfaWH = Driver.getDriver().getWindowHandle();
// clik Here butonuna basin
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();

       

        String ikinciSayfaWH = "";
        for (String each : windowHandleSeti
        ) {
            if (!each.equals(ilkSayfaWH)) {
                ikinciSayfaWH = each;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaWH);

        System.out.println(Driver.getDriver().getTitle());

        // acilan pencerenin new
        String expectedTitle = "New Window";
        String actualTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void test02() {
        Driver.getDriver().get(" https://the-internet.herokuapp.com/windows ");

        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();

    }
}