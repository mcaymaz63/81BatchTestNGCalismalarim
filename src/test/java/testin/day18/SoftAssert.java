package testin.day18;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;

public class SoftAssert extends TestBaseBeforeAfter {
    @Test
    public void test01() throws IOException {
    /*
        SoftAssert başlangıç ve bitiş satırları arasındaki tüm assertion'ları yapıp
        bitiş olarak belirtmemiz gereken assertAll() metoduyla test metodumuzdaki bütün assertion'ları
        kontrol eder. Failed olan olursa assertion yaptığımız metodun sonuna yazdığımız mesajı bize
        konsolda verir
         */
        org.testng.asserts.SoftAssert softAssert = new org.testng.asserts.SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://arabam.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("toyota"),"Girdiğiniz kelimeyi içermiyor");
       // arama kutusu
        WebElement aramaKutusu= driver.findElement(By.xpath("(//*[@class='input'])[1]"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"arama kusuna erisilmiyor");

        // toyota arat
        aramaKutusu.sendKeys("toyota", Keys.ENTER);

        // ilk resim tikla
        driver.findElement(By.xpath("//*[@class='listing-image loaded']")).click();

        // sonucyazisi
        WebElement arabaFiati = driver.findElement(By.xpath("//*[@class='color-red4 font-default-plusmore bold fl  ']"));
        System.out.println("fiyat:"+arabaFiati.getText());


        // ekaran goruntusu
        TakesScreenshot ts = (TakesScreenshot) driver;
        File tumSayfaResmi = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfaResmi,new File("target/ekranGoruntusu/AllPage"+tarih+".jpeg"));
    }
}
