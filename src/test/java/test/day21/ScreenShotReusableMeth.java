package test.day21;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
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

    @Test
    public void test02() throws IOException {
        //Amazon s gidiniz
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        AmazonPages amazonPages=new AmazonPages();
        //samsung handy aratinz
        amazonPages.searchBox.sendKeys("Samsung Handy", Keys.ENTER);
        //Arama sonuc yazisi WE resmini aliniz
        ReusableMethods.getScreenshotWebElement("Amazon arama sonucu",amazonPages.writingOfResult);

        Driver.quitDriver();

    }


}
