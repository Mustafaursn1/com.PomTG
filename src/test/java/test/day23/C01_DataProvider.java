package test.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.security.Key;
import java.util.Date;

public class C01_DataProvider {


    @Test
    public void test01() {
        AmazonPages amazonPages = new AmazonPages();
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        amazonPages.searchBox.sendKeys("Nutella", Keys.ENTER);
        String expectedResult = "Nutella";
        String actualResult = amazonPages.writingOfResult.getText();

        Assert.assertTrue(actualResult.contains(expectedResult));
        Driver.quitDriver();

    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler) {
        //amazona gidelim
        //java, selenium, samsung ve iphone icin aroma yapalim
        // sonuclarin aradigimiz kelime icerdigini test edelim /sayfayi kapatalim
        AmazonPages amazonPages = new AmazonPages();
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        amazonPages.searchBox.sendKeys(kelimeler, Keys.ENTER);


    }

    @DataProvider
    public static Object[][] aranacakKelimeler() {

        return new Object[][]{{"java"}, {"selenium"}, {"samsung"}, {"iphone"}};
    }


}
