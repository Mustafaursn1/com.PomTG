package test.day21;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeEbayReusableMeth {

    //Ebay sayfasina gidelim
    //Sayfanin resmini alalim
    //Elektronik altinda bilgisayar/tablet altindaki tüm linkleri tiklayalim
    //Her linkten sonra o sayfoya gittimizi test edelim ve o sayfaniz resmini alalim
    //Sayfay kapatalim

    @Test
    public void test1() throws IOException {
        //Ebay sayfasina gidelim
        //Sayfanin resmini alalim
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayUrl"));

        ReusableMethods.getScreenshot("ebay");
    }
}
