package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2 ) Berlin’i 3 farkli relative locator ile locate edin
        //sailor'un ustundeki diyelim

        WebElement sailorElement=driver.findElement(By.xpath("//p[text()='Sailor']"));
        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElement));

        //3 ) Relative locator’larin dogru calistigini test edin

        //id'si pid7_thumb

        String expectedIdDegeri="pid7_thumb";
        String actualIdDegeri=berlin1.getAttribute("Id");

        if (expectedIdDegeri.equals(actualIdDegeri)){
            System.out.println("relative locator testi PASSED");
        }else{
            System.out.println("relative locator testi FAILED");
        }


    Thread.sleep(3000);
    driver.close();
    }
}
