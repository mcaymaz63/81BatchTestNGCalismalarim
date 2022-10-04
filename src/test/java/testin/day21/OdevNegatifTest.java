package testin.day21;

import Pages.TrendYolPage;
import org.junit.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class OdevNegatifTest {

    @Test
    public void negatifTest() throws InterruptedException {

        // https://www.trendyol.com/ adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("trdYolUrl"));
        TrendYolPage trendYolPage = new TrendYolPage();
        // Çerezleri kabul et

        trendYolPage.acceptCokie.click();

        trendYolPage.mainLogin.click();


        trendYolPage.emailBox.sendKeys(ConfigReader.getProperty("trndylNegativeUsername"));

        trendYolPage.negativeMessage.sendKeys(ConfigReader.getProperty("trndylNegativePassword"));

        trendYolPage.girisButton.click();

        // sayfaya girilmedigini test ediniz
        Assert.assertTrue(trendYolPage.negativeMessage.isDisplayed());


    }

    @Test
    public void pozitfTest() throws InterruptedException {

        // https://www.trendyol.com/ adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("trdYolUrl"));
        TrendYolPage trendYolPage = new TrendYolPage();
        // Çerezleri kabul et

        trendYolPage.acceptCokie.click();

        trendYolPage.mainLogin.click();


        trendYolPage.emailBox.sendKeys(ConfigReader.getProperty(""));

        trendYolPage.negativeMessage.sendKeys(ConfigReader.getProperty(""));

        trendYolPage.girisButton.click();

        // sayfaya girilmedigini test ediniz
        Assert.assertTrue(trendYolPage.negativeMessage.isDisplayed());

    }
}