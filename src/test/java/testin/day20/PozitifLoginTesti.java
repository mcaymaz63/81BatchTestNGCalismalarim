package testin.day20;

import Pages.BluerentalcarsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTesti {

    @Test
    public void pozitifLoginTesti() throws InterruptedException {
        BluerentalcarsPage bluerentalcarsPage = new BluerentalcarsPage();

        //https://www.bluerentalcars.com/ adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsUrl"));
        Thread.sleep(3000);

        // login butunona basiniz
    bluerentalcarsPage.ilkLoginBotunu.click();
        Thread.sleep(3000);

        //test data user email : customer@bluerentalcars.com
        bluerentalcarsPage.emailTexBox.sendKeys(ConfigReader.getProperty("blucarValidEmail"));

        //test data password:12345
        bluerentalcarsPage.passwordTexBox.sendKeys(ConfigReader.getProperty("blucarPassword"));

        // login butonuna basiniz
        bluerentalcarsPage.ikinciLoginButonu.click();

        // degerleri girildiginde sayfaya basarili sekilde girebildigini test et

        String actualUserName=bluerentalcarsPage.kullaniciProfilIsmi.getText();
        String expectedUserName=ConfigReader.getProperty("blucarValidUserName");
        Assert.assertEquals(actualUserName, expectedUserName);
        //System.out.println(bluerentalcarsPage.kullaniciProfilIsmi.getText());
        Driver.closeDriver();



    }
}
