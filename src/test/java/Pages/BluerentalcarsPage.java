package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BluerentalcarsPage {

    public BluerentalcarsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[1]")
    public WebElement ilkLoginBotunu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTexBox;

    @FindBy(xpath = "(//*[@id='formBasicPassword'])")
    public WebElement passwordTexBox;


    @FindBy(xpath = "(//*[text()=' Login'])[2]")
    public WebElement ikinciLoginButonu;

    @FindBy(id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;
}
