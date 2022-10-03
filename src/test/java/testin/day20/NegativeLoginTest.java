package testin.day20;

import Pages.BluerentalcarsPage;
import org.junit.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    @Test
    public void yanlisKulliciAdi() throws InterruptedException {

        BluerentalcarsPage bluerentalcarsPage = new BluerentalcarsPage();

        //https://www.bluerentalcars.com/ adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsUrl"));
        Thread.sleep(3000);

        // login butunona basiniz
        bluerentalcarsPage.ilkLoginBotunu.click();
        Thread.sleep(3000);

        //test data user email : customer@bluerentalcars.com
        bluerentalcarsPage.emailTexBox.sendKeys(ConfigReader.getProperty("blucarWrongEmail"));

        //test data password:54321
        bluerentalcarsPage.passwordTexBox.sendKeys(ConfigReader.getProperty("blucarPassword"));

        // login butonuna basiniz
        bluerentalcarsPage.ikinciLoginButonu.click();

        // degerlei girildiginde sayfa basarili sekilde girildigini test et
        Assert.assertTrue(bluerentalcarsPage.ikinciLoginButonu.isDisplayed());



    }

    @Test
    public void yanlisSifreVeKullanici() throws InterruptedException {
        BluerentalcarsPage bluerentalcarsPage = new BluerentalcarsPage();

        //https://www.bluerentalcars.com/ adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsUrl"));
        Thread.sleep(3000);

        // login butunona basiniz
        bluerentalcarsPage.ilkLoginBotunu.click();
        Thread.sleep(3000);

        //test data user email : customer@bluerentalcars.com
        bluerentalcarsPage.emailTexBox.sendKeys(ConfigReader.getProperty("blucarValidEmail"));

        //test data password:54321
        bluerentalcarsPage.passwordTexBox.sendKeys(ConfigReader.getProperty("blucarWrongPassword"));

        // login butonuna basiniz
        bluerentalcarsPage.ikinciLoginButonu.click();

        // degerlei girildiginde sayfa basarili sekilde girildigini test et
        Assert.assertTrue(bluerentalcarsPage.ikinciLoginButonu.isDisplayed());


    }

    @Test
    public void yanlisSifre() throws InterruptedException {


        BluerentalcarsPage bluerentalcarsPage = new BluerentalcarsPage();

        //https://www.bluerentalcars.com/ adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsUrl"));
        Thread.sleep(3000);

        // login butunona basiniz
        bluerentalcarsPage.ilkLoginBotunu.click();
        Thread.sleep(3000);

        //test data user email : customer@bluerentalcars.com
        bluerentalcarsPage.emailTexBox.sendKeys(ConfigReader.getProperty("blucarValidEmail"));

        //test data password:54321
        bluerentalcarsPage.passwordTexBox.sendKeys(ConfigReader.getProperty("blucarWrongPassword"));

        // login butonuna basiniz
        bluerentalcarsPage.ikinciLoginButonu.click();

        // degerlei girildiginde sayfa basarili sekilde girildigini test et
        Assert.assertTrue(bluerentalcarsPage.ikinciLoginButonu.isDisplayed());

        
    }
}
