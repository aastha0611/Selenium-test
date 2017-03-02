import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class KaplanTest {

	public static void main(String[] args) {
		//Set up gecko driver
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\aasth\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Find the link to registration form
        driver.get("https://www.kaptest.com/gmat/enroll?zip=&tab=events");
        WebElement link =driver.findElement(By.className("btn-primary"));
        
        //click on the link
        link.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Fill in the fields
        WebElement firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys("Anita");
        
        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("Mahajan");
        
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("anitaaashi01@gmail.com");
        
        WebElement confirmEmail=driver.findElement(By.id("confirmEmail"));
        confirmEmail.sendKeys("anitaaashi01@gmail.com");
        
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("password0611");
        
        WebElement confirmPassword=driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("password0611");
        
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("United States of America");
        
        Select state = new Select(driver.findElement(By.id("state")));
        state.selectByVisibleText("New Jersey");
        
        WebElement zip=driver.findElement(By.id("zip"));
        zip.sendKeys("07310");
        
        WebElement phoneNumber=driver.findElement(By.id("phoneNumber"));
        phoneNumber.sendKeys("1234567899");
        
        //Fill in additional fields
        Select currentSchoolState = new Select(driver.findElement(By.id("currentSchoolState")));
        currentSchoolState.selectByVisibleText("New York");
        
        Select currentSchoolName = new Select(driver.findElement(By.id("currentSchoolName")));
        currentSchoolName.selectByVisibleText("New York University, New York, NY");
        
        Select gradYear = new Select(driver.findElement(By.id("gradYear")));
        gradYear.selectByVisibleText("2016");
        
        driver.findElement(By.id("idontknowmytestDate")).click();
        
        //Submit the form
        firstName.submit();
        }

}
