package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.close();

        Thread.sleep(5000);

        /*
            Selenium jar dosyalarini ve chromedriver driver'ini manuel olarak sisteme
            tanitmis olduk


            Eger firefox veya safari ile calismamiz gerekse ,
            bu defa da onlarin driver'larini indirip manuel olarak
            10.satirda o driver'lari tanımlamaliyiz
         */

    }



}
