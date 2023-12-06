package test.day21;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class ScreenShotReusableMeth {
    AmazonPages amazonPages = new AmazonPages();

    @Test
    public void test1() throws IOException {
        //ebay sayfasina gidelim
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayUrl"));
        //Web sayfasinin resmini aliniz
        ReusableMethods.getScreenshot("ebay");
        //Driver i kapatiniz
        Driver.quitDriver();

    }


}
