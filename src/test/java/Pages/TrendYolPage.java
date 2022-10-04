package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendYolPage {

    public TrendYolPage() { //Constructor oluşturup public yapmamız gerekir
        PageFactory.initElements(Driver.getDriver(), this);

    }
    //WebElement cokie = Driver.getDriver().findElement("//button[@id='onetrust-accept-btn-handler']"));


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement acceptCokie;

    @FindBy(xpath = "(//*[@class='link-text'])[1]")
    public WebElement mainLogin;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='login-password-input']")
    public WebElement negativeMessage;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[4]")
    public WebElement girisButton;
}
