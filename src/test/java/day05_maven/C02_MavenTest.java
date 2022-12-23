package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_MavenTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin

        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        //3. Login alanine  “username” yazdirin
        WebElement userName= driver.findElement(By.xpath("//input[@id='user_login']"));
        userName.sendKeys("username");

        //4. Password alanine “password” yazdirin
        WebElement password=driver.findElement(By.xpath("//input[@id='user_password']"));
        password.sendKeys("password");

        //5. Sign in buttonuna tiklayin

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //6. navigate back yapip, online payments menusundan Pay Bills sayfasina gidin

        driver.navigate().back();
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();


        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("200");
        Thread.sleep(3000);

        //8. tarih kismina “2020-09-10” yazdirin

        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
        Thread.sleep(3000);

        //9. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin

        WebElement payment= driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));
        if (payment.isDisplayed()){
            System.out.println("The payment was successfully submitted. testi PASSED");
        }else{
            System.out.println("The payment was successfully submitted. testi FAILED");
        }


        Thread.sleep(3000);
        driver.close();

    }
}
