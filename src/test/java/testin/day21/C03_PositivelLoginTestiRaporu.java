package testin.day21;

import Pages.BluerentalcarsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;



public class C03_PositivelLoginTestiRaporu extends TestBaseRapor {

    BluerentalcarsPage bluerentalcarsPage = new BluerentalcarsPage();
        @Test
        public void pozitifLoginTesti() throws InterruptedException {
            extentTest=extentReports.createTest("pozitif username","gecerli username ve sifre ile giris yapabilmeli");

            //https://www.bluerentalcars.com/ adresine gidiniz
            Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsUrl"));
            extentTest.info("Brc ana sayfaya gidildi");


            // login butunona basiniz
            bluerentalcarsPage.ilkLoginBotunu.click();
            extentTest.info("login butonuna tiklandi");


            //test data user email : customer@bluerentalcars.com
            bluerentalcarsPage.emailTexBox.sendKeys(ConfigReader.getProperty("blucarValidEmail"));
          extentTest.info("gecerli email girildi");
            //test data password:12345
            bluerentalcarsPage.passwordTexBox.sendKeys(ConfigReader.getProperty("blucarPassword"));
           extentTest.info("gecerli password girildi");
            // login butonuna basiniz
            bluerentalcarsPage.ikinciLoginButonu.click();
            extentTest.info("login butonuna basildi");

            // degerleri girildiginde sayfaya basarili sekilde girebildigini test et

            String actualUserName = bluerentalcarsPage.kullaniciProfilIsmi.getText();
            String expectedUserName = ConfigReader.getProperty("blucarValidUserName");
            Assert.assertEquals(actualUserName, expectedUserName);
              extentTest.pass("kullanici basarili bir sekilde giris yapti");
            Driver.closeDriver();



        }
    }