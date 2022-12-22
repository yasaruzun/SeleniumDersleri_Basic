package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_AutomationExercise {
    public static void main(String[] args) {

        //Bir test class'i yapın ve ilgili ayarlari olusturun.
        System.setProperty("webriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://www.automationexercise.com adresine gidin.
        driver.get("https://www.automationexercise.com");

        //Category bolumundeki elementleri locate edin
        List<WebElement> category = driver.findElements(By.xpath("//div[@id='accordian']"));
        //System.out.println(category);
        //Category bolumunde 3 element oldugunu testedin.
      


        for (WebElement each:category) {
            System.out.println(each.getText());
            String str = each.getText();


        }
        

        //Category isimlerini yazdirin.
        //Sayfayi kapatin
        driver.close();
        }



    }

