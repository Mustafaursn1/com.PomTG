package test.day21;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class ScreenShotReusableMeth {

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
