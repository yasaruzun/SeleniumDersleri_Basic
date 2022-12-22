package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin

        String expectedMetin="Spend less";
        String actualMetin=driver.getTitle();
        if(actualMetin.contains(expectedMetin)){
            System.out.println("title testi PASSED");
        }else{
            System.out.println("title testi FAILED");
        }

        //6- Gift Cards sekmesine basin

        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(2000);


        //7- Birthday butonuna basin

        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        Thread.sleep(2000);

        //8- Best Seller bolumunden ilk urunu tiklayin

        driver.findElement(By.xpath("(//li[@class='a-carousel-card acswidget-carousel__card'])[1]")).click();
        Thread.sleep(2000);

        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();
        Thread.sleep(2000);

        //10-Urun ucretinin 25$ oldugunu test edin

        WebElement urunUcretElementi= driver.findElement(By.xpath("(//span[text()='$25.00'])[1]"));
        String expectedUcret="$25.00";
        String actualUcretYazisi= urunUcretElementi.getText();
        if(expectedUcret.equals(actualUcretYazisi)){
            System.out.println("gift card ucret testi PASSED");
        }else{
            System.out.println("gift card ucret testi FAILED");
        }

        //11-Sayfayi kapatin



        Thread.sleep(3000);
        driver.close();
    }
}
