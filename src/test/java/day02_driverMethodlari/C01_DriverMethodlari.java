package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {


        // Biz browser'lari olusturdugumuz driver sayesinde otomatize edebiliriz
        // Bunun icin her testin basinda mutlaka driver objesi olusturacagiz

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://wwww.amazon.com");
        //acilan sayfanin basliginin amazon icerdigini test edin

        String expectedKelime="amazon";
        String actualResult=driver.getTitle();

        if(actualResult.contains(expectedKelime)){

            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title amazon icermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }

        //gittigimiz sayfanin url'nin https://www.amazon.com/ oldugunu test edin

        String expectedUrl="https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();


        if(expectedUrl.equals(actualUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Url istediginiz degerde degil");
            System.out.println(driver.getCurrentUrl());
        }


        Thread.sleep(5000);

        driver.close();


    }
}
