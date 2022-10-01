package testin.day16;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class Odev extends TestBaseBeforeAfter {

    @Test
    public void test1() {

        //1) Bir class oluşturun: YoutubeAssertions
        //2) https://www.youtube.com adresine gidin
        driver.get("https://www.youtube.com");
        //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
    }

    @Test
    public void test2() throws InterruptedException {

        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String actualTitle =driver.getTitle();
        String expectedTitle = "YouTube";

        Assert.assertTrue(expectedTitle.contains(actualTitle) );
        Thread.sleep(3000);

    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("https://www.youtube.com");
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        Thread.sleep(3000);
        WebElement youtubeLogo = driver.findElement(By.xpath("(//*[@class='style-scope ytd-logo'])[1]"));
        Assert.assertTrue(youtubeLogo.isDisplayed());
      //  Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]")).isDisplayed());
Thread.sleep(3000);
    }

    @Test
    public void test4() throws InterruptedException {
        driver.get("https://www.youtube.com");
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())

        Assert.assertTrue(driver.findElement(By.xpath("//*[@name='search_query']")).isEnabled());

        Thread.sleep(3000);

    }

    @Test
    public void test5() {
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String actualTitle = driver.getTitle();
        String expectedTitle ="youtube";
        Assert.assertNotEquals(expectedTitle, actualTitle);


    }
}