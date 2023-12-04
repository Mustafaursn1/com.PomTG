package test.day18;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FacebookPages;
import utilities.Driver;

public class C01_FacebookTest {


    @Test
    public void test01() {
        //Facebook `agidleim
        Driver.getDriver().get("https://www.facebook.com");
        //POM A ygunolarka password ve login butonunu locate ediniz

        FacebookPages facebookPages = new FacebookPages();
        facebookPages.cookies.click();


        //Faker class kullanarak email ve sifre belirleyiniz
        Faker faker = new Faker();

        facebookPages.email.sendKeys(faker.internet().emailAddress());

        //yazdirip giris butonuna tiklayiniz
        facebookPages.password.sendKeys(faker.internet().password());

        facebookPages.logIn.click();

        //Basarili giris yapilmadigini Assertion ile kont ediniz
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(facebookPages.basarisizGiris.isDisplayed(), "giris basarili");
        softAssert.assertAll();
        System.out.println("*****************************");
        System.out.println("Basaris Giris Tex:" + facebookPages.basarisizGiris.getText());
        Driver.quitDriver();


    }

    @Test
    public void test02() {

        System.out.println("Bu testv sonra planlanir");
    }

}
