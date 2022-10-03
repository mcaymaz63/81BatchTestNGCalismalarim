package testin.day16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

import java.time.Duration;

public class C05_DependesOnMethod  {

    /*
    dependesOnMethod test methodlarinin calisma siralamasina karismaz sadece bagli olan
     test baglandigi testin sonucuna bakar
      baglandigi testPASSED olmazsa, baglanan test hic calismaz(ignored)


    */
    WebDriver driver;
    @BeforeClass
    public  void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
@AfterClass
public void tearDown() {
driver.close();
}
    @Test
    public void test01() {
driver.get("https://www.amazon.com");

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        // Nutella aratalim,
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
// sonuc yazisinin nutella icerdigini test edelim

        WebElement sonucYazisi=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYazisi.getText().contains("Nutella"));

    }
@Test(groups = "grup1")
    public void test04() {
        System.out.println("bu calisti ha");

    }
}
