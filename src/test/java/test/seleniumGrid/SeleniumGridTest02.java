package test.seleniumGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridTest02 {

    WebDriver driver;

    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        driver=new RemoteWebDriver(new URL("http://192.168.178.21:4444"),new EdgeOptions());
        driver.get("https://www.bluerentalcars.com");
        Thread.sleep(3000);

        String customerService=driver.findElement(By.xpath("//*[text()='Customer Services']")).getText();
        System.out.println(customerService);
        Thread.sleep(3000);
        System.out.println("Current Thread: "+Thread.currentThread());
        System.out.println("Blue Rental Titel: "+driver.getTitle());



    }
}
