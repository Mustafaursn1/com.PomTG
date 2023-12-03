package test.day19;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C02_SingletonPattern {
    @Test
    public void test01(){
        //Driver obj=new Driver();
        //obj.getDriver(ConfigurationReader.getProperty("amazonUrl"));

        /*
        Driver class daki default constructor kullanilarak obj isimli bir obj üreterek Driver class ina pratikte
        ulasilabilir.Bunun önüne gecmek icin Driver class inda bir private constructor olusturuyoruz

        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        SingletonPattern: Tekli kullanim demektir.Bir class in
        farkli class lardan obj olusturup kullanimini engellemektir
        !-->Bunun Tam Tersi Conventional Implementation olarak isimlendirilir<---!
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

         */


    }
}
