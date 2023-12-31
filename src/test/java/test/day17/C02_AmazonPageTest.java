package test.day17;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.Driver;

public class C02_AmazonPageTest {

    AmazonPages amazonPages = new AmazonPages();

    @Test(groups = "gp1")
    public void test1() {
        Driver.getDriver().get("https://www.amazon.com");
        amazonPages.searchBox.sendKeys("Nutella", Keys.ENTER);
        Driver.quitDriver();

    }
    @Test(groups = "gp2")
    public void test2() {
        Driver.getDriver().get("https://www.amazon.com");
        amazonPages.searchBox.sendKeys("Samsung Handy", Keys.ENTER);
        Driver.quitDriver();

    }



}
