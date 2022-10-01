package testin.day17;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class C01 extends TestBaseBeforeAfter {
    @Test
    public void test01() {
        // odev
        //Yeni bir Class Olusturun : C03_SoftAssert
        //“http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com/");
        //Sign in butonuna basin
        driver.findElement(By.xpath("(//*[@id='signin_button'])[1]")).click();
        //Login kutusuna “username” yazin
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");
        //Password kutusuna “password” yazin
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");
        //Sign in tusuna basin
        driver.findElement(By.xpath("//*[@name='submit']")).click();
        //Online banking menusu icinde Pay Bills sayfasina gidin

        //“Purchase Foreign Currency” tusuna basin
        //“Currency” drop down menusunden Eurozone’u secin
        //soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        //soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin  "Select One", "Australia (dollar)",
        // "Canada (dollar)","Switzerland (franc)","China  (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)",
        // "Hong Kong  (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand  (dollar)","Sweden (krona)",
        // "Singapore (dollar)","Thailand (baht)"
    }
}
