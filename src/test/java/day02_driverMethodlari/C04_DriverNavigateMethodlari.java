package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://www.amazon.com");
        // get ile ayni islevi yapar

        Thread.sleep(3000);
        driver.get("https://www.wisequarter.com");

        //yeniden amazona donelim
        driver.navigate().back();

        Thread.sleep(3000);
        //tekrar wisequarter.com'a gtmek istersek
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.close();

    }
}
