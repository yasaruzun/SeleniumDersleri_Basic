package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q1 {
    public static void main(String[] args) throws InterruptedException {


        //1. Launch browser

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //2. Navigate to url 'http://automationexercise.com'

        driver.get("https://automationexercise.com");

        //3. Verify that home page is visible successfully

       String actualbaslik=driver.getTitle();
       String expectedbaslik="Automation Exercise";

        if(actualbaslik.equalsIgnoreCase(expectedbaslik)){
            System.out.println("home page gorunmektedir,test PASSED");
        }else {
            System.out.println("home page gorunmemektedir,test FAILED");
        }

        //4. Click on 'Signup / Login' button

        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

        //5. Verify 'New User Signup!' is visible

        WebElement newUserSignupYazisi= driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

        if (newUserSignupYazisi.isDisplayed()){
            System.out.println("New User Signup! yazisi gorunmektedir,PASSED");
        }else{
            System.out.println("New User Signup! yazisi gorunmemektedir,FAILED");
        }

        //6. Enter name and email address

        WebElement name=driver.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys("Yasar");
        WebElement emailAdres= driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        emailAdres.sendKeys("yasaruzun91@gmail.com");

        Thread.sleep(2000);

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        WebElement enterAccountYazisi=driver.findElement(By.xpath("//b[text()='Enter Account Information']"));

        if (enterAccountYazisi.isDisplayed()){
            System.out.println("ENTER ACCOUNT INFORMATION yazisi gorunmektedir,PASSED");
        }else{
            System.out.println("ENTER ACCOUNT INFORMATION yazisi gorunmemektedir,FAILED");
        }
        Thread.sleep(3000);
        //9. Fill details: Title, Name, Email, Password, Date of birth

        driver.findElement(By.xpath("//label[@for='id_gender1']")).click();


        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("55010535033027");



                WebElement day=driver.findElement(By.xpath("//select[@id='days']"));
                day.sendKeys("21");

                WebElement month= driver.findElement(By.xpath("//select[@id='months']"));
                month.sendKeys("February");

                WebElement year=driver.findElement(By.xpath("//select[@id='years']"));
                year.sendKeys("1992");



        //10. Select checkbox 'Sign up for our newsletter!'

        driver.findElement(By.xpath("//input[@name='newsletter']")).click();

        //11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@name='optin']")).click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number


        WebElement firstName=driver.findElement(By.xpath("//input[@data-qa='first_name']"));
        firstName.sendKeys("Yasar");

        WebElement lastName=driver.findElement(By.xpath("//input[@data-qa='last_name']"));
        lastName.sendKeys("Uzun");

        WebElement company=driver.findElement(By.xpath("//input[@data-qa='company']"));
        company.sendKeys("ICA");

        WebElement adress=driver.findElement(By.xpath("//input[@data-qa='address']"));
        adress.sendKeys("abdulhamidhan cad. beykoz sitesi");

        WebElement address2=driver.findElement(By.xpath("//input[@data-qa='address2']"));
        address2.sendKeys("Basaksehir/Istanbul");

        driver.findElement(By.xpath("//option[text()='United States']"));
        WebElement state=driver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys("california");

        WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("ohiao");

        WebElement zipCode=driver.findElement(By.xpath("//input[@id='zipcode']"));
        zipCode.sendKeys("34110");

        WebElement mobileNumber=driver.findElement(By.xpath("//input[@id='mobile_number']"));
        mobileNumber.sendKeys("5362612020");

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        Thread.sleep(3000);

        WebElement accountCreatedYazisi=driver.findElement(By.xpath("//b[text()='Account Created!']"));

        if (accountCreatedYazisi.isDisplayed()){
            System.out.println("ACCOUNT CREATED! yazisi görünür,PASSED");
        }else{
            System.out.println("ACCOUNT CREATED! yazisi görünür degildir,FAILED");
        }

        //15. Click 'Continue' button

        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

        //16. Verify that 'Logged in as username' is visible

        WebElement loggedInAsUsernameYazisi=driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        if (loggedInAsUsernameYazisi.isDisplayed()){
            System.out.println("Logged in as yazisi gorunmektedir,PASSED");
        }else{
            System.out.println("Logged in as yazisi gorunmemektedir,FAILED");
        }

        //17. Click 'Delete Account' button


        driver.findElement(By.xpath("(//a[@style='color:brown;'])[2]")).click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        WebElement accountDeleted= driver.findElement(By.xpath("//h2[@data-qa='account-deleted']"));
        if (accountDeleted.isDisplayed()){
            System.out.println("ACCOUNT DELETED! yazisi gorunmektedir,PASSED");
        }else{
            System.out.println("ACCOUNT DELETED! yazisi gorunmemektedir,FAILED");
        }

        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

        Thread.sleep(3000);
        driver.close();
    }
}
