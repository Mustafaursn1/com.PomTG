package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPages {
    public EbayPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[text()='Electronics'])[2]")
    public WebElement electronict;

    @FindBy(xpath = "//*[@id='gh-ac']")
    public WebElement searchBox;

}
