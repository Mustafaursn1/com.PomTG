package test.day21;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HerOkuPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class C01_WindowsHandlesReusablesMeth {

    // https://the-internet.herokuapp.com/windows adresine gidin.
    // Click Here butonuna basiniz
    // acilan yeni tab'in title'inin "New Window" oldugunu test edin
    @Test
    public void test01() {
        HerOkuPage herOkuPage = new HerOkuPage();
        // https|://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");


        // Click Here butonuna basiniz
        herOkuPage.clickWindowHandl.click();


        ArrayList<String> windowsHandl = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowsHandl.get(1));
        String expectedTitle = "New Window";
        String actualTitel = Driver.getDriver().getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedTitle, actualTitel);
        softAssert.assertAll();


        // acilan yeni tab'in title'inin "New Window" oldugunu test edin


        Driver.quitDriver();

    }
    @Test
    public void test02(){
        HerOkuPage herOkuPage = new HerOkuPage();
        // https|://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");


        // Click Here butonuna basiniz
        herOkuPage.clickWindowHandl.click();
        ReusableMethods.switchToWindow("New Window");
        String expectedTitel="New Window";
        String actualTitel=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(expectedTitel,actualTitel);
        softAssert.assertAll();

        Driver.quitDriver();





    }


}
