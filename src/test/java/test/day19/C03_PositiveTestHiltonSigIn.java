package test.day19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HiltonPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C03_PositiveTestHiltonSigIn {
    /*
1) Bir Class olustur : PositiveTest
2) Bir test method olustur positiveLoginTest)
    https://www.hotelmycamp.com/adresine git
    login butonuna bas
    test data username: manager,
    test data password: Managerl!
    Degerleri grildinde sayfaya basarili sekilde girilebildigini test et
     */
    HiltonPages hiltonPages = new HiltonPages();

    @Test
    public void test01() {
        String hotelUrl = ConfigurationReader.getProperty("hotelUrl");
        Driver.getDriver().get(hotelUrl);
        hiltonPages.cookies.click();
        hiltonPages.signIn.click();


        System.out.println("iframeList:" + hiltonPages.iframe.size());
        Driver.getDriver().switchTo().frame(hiltonPages.iframe.get(1));


        hiltonPages.userName.sendKeys(ConfigurationReader.getProperty("hotelUserName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigurationReader.
                        getProperty("hotelPassword")).
                sendKeys(Keys.ENTER).perform();


        Driver.getDriver().quit();

    }


}
