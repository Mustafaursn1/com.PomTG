package test.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FacebookPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C02_DataProvider {

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"erol@gmail.com","123456"},{"evren@gmmail.com","45678,"},{"tobias@gmail.com","098856"}};
    }

    @Test(dataProvider = "kullanicilar")
    public void test01(String userEmail,String password ){
        FacebookPages facebookPages=new FacebookPages();
        Driver.getDriver().get(ConfigurationReader.getProperty("faceUrl"));

        //Data Prpvider ile 3 farkli userEmail ve 3 farkli password giriniz
        facebookPages.email.sendKeys(userEmail);

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password).sendKeys(Keys.ENTER).perform();
        facebookPages.logIn.click();





    }
}
