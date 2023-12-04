package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.reporters.jq.INavigatorPanel;

import java.time.Duration;

public class Driver {
    private Driver() {

    }

    static WebDriver driver;

    /*
    Testlerimizi calistirdigimizda her seferinde yeni driver olusturdugu için her test methodu için yeni bir pencere(driver) açyor.
     Eger driver'a bir deger atanmamissa yani driver==null ise bir kere driver'i calistir diyerek bir kere if icini colstiracak
     Ve driver artik bir kere calsitigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve
      diger teslerimiz ayni pencere(driver) üzerinde calisacak
     */
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigurationReader.getProperty("browser")) {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;


                default:

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null; //kapandiktaan sonra driver default olarak null `esittir ama biz yine de null` aesitledik
        }

    }

}
