package test.day18;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C02_ConfigurationProperties {
    @Test (groups = "gp2")
    public void test01() {
        String urlAmz = ConfigurationReader.getProperty("amazonUrl");
        String urlFace = ConfigurationReader.getProperty("faceUrl");
        Driver.getDriver().get(urlAmz);
        Driver.getDriver().get(urlFace);
        Driver.quitDriver();
    }
}
