package testin.day21;

import Pages.AmazonPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {


    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        // amazona gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutalle aratalim
       amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

       // sonuclarin nutalle icerdigini test edinix
        String expectedKelime="Nutella";
        String actualSonucYazisi=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
Driver.closeDriver();

    }
        @DataProvider
        public static Object[][] Aranacakkelimeler() {

            Object[][] arananKelimeArrayi= {{"Nutella"}, {"Java"}, {"cigdem"},{"Netherlands"}};
            return arananKelimeArrayi;
    }

    @Test(dataProvider ="Aranacakkelimeler" )
    // arayacagimiz kelimelri bir liste gibi tutup
    // bana yollaycak bir veri saglayici olusturacagiz
    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage = new AmazonPage();
        // amazona gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // Nutella, Java, cigdem ve Netherlands icin arama yapalim
        amazonPage.aramaKutusu.sendKeys("arananKelimeArrayi"+ Keys.ENTER);
        // sonuclarin aradigimiz kelime icerdigini test edelim
        String expectedKelime=arananKelime;
        String actualSonucYazisi=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
        // sayfayi kapatiniz
Driver.closeDriver();
    }
}
