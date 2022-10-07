package testin.practice06;

import Pages.SaucedemoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Odev {

    @Test
    public void test01() throws InterruptedException {
       //     * Navigate to  https://www.saucedemo.com/
      Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));
        SaucedemoPage saucedemo= new SaucedemoPage();
//     * Kullanıcı adını standard_user olarak girin
      // saucedemo.username.sendKeys(" standard_user", Keys.ENTER);
       saucedemo.username.sendKeys(ConfigReader.getProperty("userName"));
       Thread.sleep(3000);
//     * Şifreyi secret_sauce olarak girin
        saucedemo.sifre.sendKeys(ConfigReader.getProperty("pasword"));
        Thread.sleep(3000);
//     * Giriş düğmesine tıklayın
         saucedemo.loginButton.click();
//      Düşükten yükseğe fiyat seçin

        // saucedemo.düşüktenYükseğeFiyat.click();
        Select select = new Select(saucedemo.düşüktenYükseğeFiyat);
        select.selectByVisibleText("Price (low to high)");


//     ve PRICE'ın (DÜŞÜKTEN YÜKSEK) göründüğünü doğrulayın
       Driver.getDriver().
                findElement(By.xpath("//span[@class=\"active_option\"][text()='Price (low to high)']")).
                isDisplayed();
    }
}
