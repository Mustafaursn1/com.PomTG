package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossDriver {
    public CrossDriver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        //eger browser icin bir deger atanmamissa
        browser = browser == null ? ConfigurationReader.getProperty("browser") : browser;
        //Testlerimizi xml file dan farkli browser lar ile calistirmak icin getDriver() methoduna parametre atamamiz gerekir
        if (driver == null) {
            switch (browser) {
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


        }
        return  driver;
    }

    public static void quitDriver(){
        driver.quit();
    }

}
