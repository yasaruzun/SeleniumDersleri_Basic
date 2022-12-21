package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        //amazon a gidip nutella icin  arama yapin
        // ilk sayfada cikan urunlerin icerisinde en yuksek fiyati bulun

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        List<WebElement> fiyatlarListesi=driver.findElements(By.className("a-price-whole"));

        //web element bir obje oldugundan direk yazdirilamaz
        //System.out.println(fiyatlarListesi);

        //Bunun icin for each loop kullanarak her bir web element uzerindeki yazilari tek tek yazdirmaliyiz



        for (WebElement each: fiyatlarListesi
             ) {
            System.out.print(each.getText()+" ");
        }



        // en yuksek fiyati bulabilmek icin java bilgimizi kullanmaliyiz.
        // 1- web elementlerden getText ile fiyati String olarak alin
        // 2- String fiyati kiyaslama yapaiblmek icin Integer a cevirin
        // 3- en yuksek fiyati bulup yazdirin

        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;

        for (WebElement each: fiyatlarListesi
        ) {
            fiyatStr=each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);

            if(fiyatInt>enYuksekFiyat){
                enYuksekFiyat=fiyatInt;
            }
        }
        System.out.println("");
        System.out.println("en yuksek urun fiyati : "+enYuksekFiyat);

        Thread.sleep(3000);
        driver.close();
    }
}
