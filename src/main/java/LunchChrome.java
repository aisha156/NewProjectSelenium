import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LunchChrome {
    WebDriver driver;
    public void LunchBroswer() {


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
    public void manage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void LunchUrl() {

        driver.get("https://wordpress.com/me");
        String expectedTitle = "Log In — WordPress.com";
        String actualTitle =driver.getTitle();

        if(expectedTitle.equals(actualTitle))
            System.out.println("Verifcation sucessful - the correct title - \"Log In — WordPress.com");
        else
            System.out.println("Verification Faild - An incorrect title is diplayed on web page");

    }
    public void Fillemail() {
        WebElement email = driver.findElement(By.id("\"usernameOrEmail\""));
        email.sendKeys("aisha.siddiqua1102@gmail.com");
    }
    public void ClickButton() {
        WebElement clickContinue  = driver.findElement(By.xpath("//button[contains(@class,'button form-button')]"));
        clickContinue.click();
    }
    public void EnterPasswd() {
        WebElement passwd = driver.findElement(By.xpath("//input[@id='password']"));
        passwd.sendKeys("abcd12345");

    }
    public void ClickonloginButton() {
        WebElement login = driver.findElement(By.xpath("//button[contains(@class,'button form-button')]"));
        login.click();
    }
    public void FirstName() {
        WebElement firstname =  driver.findElement(By.xpath(" //input[@id='first_name']"));
        firstname.sendKeys("Aisha");
    }
    public void LastName() {
        WebElement lastname=   driver.findElement(By.xpath(" //input[@id='last_name']"));
        lastname.sendKeys("Siddiqua");
    }
    public void FillDescription() {
        WebElement desc =   driver.findElement(By.xpath(" //textarea[@id='description']"));
        desc.sendKeys("Quality Assurance Engineer");
    }

    public void HidemyGravatarprofile(){
        WebElement Hideprofile = driver.findElement(By.xpath("//input[@id='inspector-toggle-control-0']"));
        Hideprofile.click();
    }
    public void savebutton(){
        WebElement savebutton = driver.findElement(By.xpath("//button[contains(text(),'Save profile details')]"));
        savebutton.click();
    }
    public void AddUrl(){
        WebElement addurl = driver.findElement(By.xpath(" //*[@id='']"));
        addurl.click();
        WebElement clickonaddurl = driver.findElement(By.xpath("//button[contains(text(),'Add URL')]"));
        clickonaddurl.click();

    }
    public void enterurl(){
        WebElement enterurl =driver.findElement(By.xpath("//input[@class='form-text-input profile-links-add-other__value']"));
        enterurl.sendKeys("https://www.linkedin.com/in/aisha-siddiqua-60ab80225/");

    }
    public void decs(){
        WebElement desc =driver.findElement(By.xpath("//input[@class='form-text-input profile-links-add-other__title']"));
        desc.sendKeys("Linkedin");
    }
    public void Addsitebutton(){
        WebElement Addsite = driver.findElement(By.xpath("//button[contains(text(),'Add Site')]"));
        Addsite.click();
    }
    public void closeBroswer(){
        driver.close();
        driver.quit();
    }

}
