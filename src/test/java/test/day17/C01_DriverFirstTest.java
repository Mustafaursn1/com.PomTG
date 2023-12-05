package test.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverFirstTest {

    @Test (groups = "gp1")
/*Driver Class i extend yapmaya gerekm kalmadan direk
 Driver class indan obj olusturarak ya da variable
 ve meth lar static ise dogrudan class adi ile meth ve variable cahirabiliriz
 */

    public void test01() {
        Driver.getDriver().get("https://zalando.com.de");

        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://kaufland.com.de");
        Driver.quitDriver();


    }

    @Test
    public void test02() {
        Driver.getDriver().get("https://zalando.com.de");


        Driver.quitDriver();


    }



}
