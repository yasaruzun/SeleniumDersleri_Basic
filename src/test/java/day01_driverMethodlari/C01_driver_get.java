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
            1- Selenium jar dosyalarini ve chromedriver driver'ini manuel olarak sisteme
            tanitmis olduk


            Eger firefox veya safari ile calismamiz gerekse ,
            bu defa da onlarin driver'larini indirip manuel olarak
            10.satirda o driver'lari tanımlamaliyiz



           2- 13.satirda ChromeDriver() constructor'ini kullnarak bir obje olusurduk
            bu objeyi kullanmasak bile bu satirdan dolayi bos bir browser acilir

            3- driver.get(url) driver'i yazdigimiz url'e goturur
                url yazarken www yazmazsak calisir
                ancak https:// yazmazsak method calismaz


       1- Test otomostonu nedir ?
       Manuel olarak klavye , mouse kullanrak yapabılcegımız testleri , yazdıgımız kodlar aracılıgıyla yapmaya denir.

       2- Yazılım testi nedir ? : Yazılım yapmaya baslarken ortaya konulan requırement'lerin karsılanıp ,
        karsılanmadıgının test edilmesidir.

       3- Bunu tespit edebilmek için developer'lar kodlamaya basladıgında gereksınımleri incelemeye başlarız, gereksinimler
       çerçevesinde expected result'ları belirleriz,
       developer'lar kodlarını bıtırıp test envoırement'ına yukledıkten sonra, hazırladıgımız pozıtıf ve negatıf test senaryolarını calıstırarak actual sonucları elde edip ,
       expected result ile actual result aynı mı diye bakarız.Aynı ise testimiz passed , aynı değil ise testimiz failed olur.

       4- Selenium nedir ? Selenium browser'ları otomate edecek toolların calısmasına ımkan tanıyan bir suite'dir
      Selenıum browser'ları otomate eder, bu gucle ne yapacagınız sıze kalmıs

      5- Selenium browser'ları nasıl kontrol eder ? Kullandıgımız programlama dili ile, çalıştıgımız İDE 'de  olusturacagımız
      webdriver sayasinde bilgisayarımızda ıstedıgımız browser'i kullanarak testlerimizi yapabiliriz.

         */

    }



}
