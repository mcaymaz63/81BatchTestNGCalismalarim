package testin.day18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class C01_SoftAssert extends TestBaseBeforeAfter {
    @Test
    public void test01() {
//"https://www.zero.webappsecurity.com/" adresine gidiniz
        driver.get("http://zero.webappsecurity.com/");
        // signin botununa basiniz
        driver.findElement(By.xpath("//*[@class='icon-signin']")).click();
// login kutusuna surname yazin
        WebElement loginKutusu=driver.findElement(By.xpath("//*[@name='user_login']"));
       loginKutusu.sendKeys("username");

       // passwor kutusuna password yAziniz

        WebElement password=driver.findElement(By.xpath("//*[@name='user_password']"));
        password.sendKeys("password");

        //sgnin tusuna basiniz
        driver.findElement(By.xpath("//*[@name='submit']")).click();
        driver.navigate().back();

        //online banking icinde Pay bills sayfasina gidiniz
        driver.findElement(By.xpath("(//*[text()='Online Banking'])[1]")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
        //'Purchase' button tikla
        driver.findElement(By.xpath("(//*[text()='Purchase Foreign Currency'])[1]")).click();

        //Currency drop down menusunden Eurozone secin
        WebElement ddo=driver.findElement(By.xpath("//*[@id='pc_currency']"));
     Select select=new Select(ddo);
     select.selectByVisibleText("Eurozone(euro");

     // soft assert kullanarak "Eurozone(Euro) secildigini test ediniz
        SoftAssert softAssert = new SoftAssert();
        String secileOption=select.getFirstSelectedOption().getText();
        String expected="Eurozone(Euro)";



    }
}
