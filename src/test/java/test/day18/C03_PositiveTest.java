package test.day18;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Properties;

public class C03_PositiveTest {
    /*
1) Bir Class olustur : PositiveTest
2) Bir test method olustur positiveLoginTest)
    https://www.hotelmycamp.com/adresine git
    login butonuna bas
    test data username: manager,
    test data password: Managerl!
    Degerleri grildinde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01(){
        String hotelUrl= ConfigurationReader.getProperty("hotelUrl");
        Driver.getDriver().get(hotelUrl);
    }


}
