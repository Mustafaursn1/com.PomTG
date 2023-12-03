package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HiltonPages {
    public HiltonPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@data-testid='userNameTextField']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='truste-consent-button']")
    public WebElement cookies;


    @FindBy(xpath = "//iframe")
    public List<WebElement> iframe;


}
