package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBook {

    public FaceBook() {
        PageFactory.initElements(Driver.getDriver(),this);



    }
    @FindBy(xpath="//*[@id='email']")
    public WebElement mailKutusu;


    @FindBy(id="pass")
    public WebElement sifreKutusu;

    @FindBy(name="login")
    public WebElement loginTusu;

    @FindBy(className="_9ay7")
    public WebElement girilemediYaziElementi;


}
