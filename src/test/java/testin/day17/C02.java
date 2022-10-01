package testin.day17;

import Pages.AmazonPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02 {
    @Test
    public void test01() {
        AmazonPage amazonPage= new AmazonPage();
        //amazona gideloim
        Driver.getDriver().get("https://www.amazon.com");

        //nutella aratalim
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //nutella icerdigini
        String actualSonuc=amazonPage.aramaSonucWE.getText();
        String arananKelime="nutella";
        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }
}
