package testin.pratice08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class P01 {

    pages.HerokuTestPage herokuTestPage;
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void test01() throws InterruptedException {
//Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get(" https://testpages.herokuapp.com/styled/events/javascript-events.html");
        //Tüm düğmeleri tıklayın ve hepsinin tıklandığını doğrulayın
        herokuTestPage= new pages.HerokuTestPage();
        // kodlarimizi yazarken clean code kopsaminda daha sade kod yazabilmek amaci ile her test methodu icerisinde
        // ayri bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir

        herokuTestPage.onBlur.click();
        herokuTestPage.onClick.click();
        herokuTestPage.onClick.click();
        actions.contextClick(herokuTestPage.onContextMenu).
                doubleClick(herokuTestPage.onDoubleClick).
                click(herokuTestPage.onFocus).
                click(herokuTestPage.onKeyDown)
                .sendKeys(Keys.ENTER).
                click(herokuTestPage.onKeyUp).
                sendKeys(Keys.ENTER).
                click(herokuTestPage.onKeyPress).
                sendKeys(Keys.ENTER).
                moveToElement(herokuTestPage.onMouseOver).
                moveToElement(herokuTestPage.onMouseLeave).
                moveToElement(herokuTestPage.onMouseOver).
                click(herokuTestPage.onMouseDown).perform();

        Thread.sleep(3000);


    }
@Test(dependsOnMethods = "test01")
    public void test2(){
    List<WebElement> clicked=herokuTestPage.eventTriggered;
    Assert.assertEquals(clicked.size(),11);
Driver.closeDriver();

}
}
