package testin.day17;

import Pages.FaceBook;
import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03 {
    @Test
    public void test01() {
        FaceBook faceBook = new FaceBook();

        // facabook sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        // Kullanici mail adresi
        faceBook.mailKutusu.sendKeys(ConfigReader.getProperty("facebookWrongUsername"));

        //yanlis sifreKutusu girilsin
         faceBook.sifreKutusu.sendKeys(ConfigReader.getProperty("facebookWrongPassword"));

         //login basin
          faceBook.loginTusu.click();
           // yanlis giris yapilsin
          Assert.assertTrue(faceBook.girilemediYaziElementi.isDisplayed());

            //kapatiniz
               Driver.closeDriver();

    }
}
