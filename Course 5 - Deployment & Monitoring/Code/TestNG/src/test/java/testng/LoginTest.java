package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest {

	WebDriver driver2;
	
	@BeforeMethod(alwaysRun=true)
	public void Setup() throws InterruptedException{
		//SETUP FOR WEBDRIVER
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//DRIVER OBJECT
//		driver = new ChromeDriver();
		driver2 = new FirefoxDriver();
		
		//EXAMPLE SITE OPENING
//		driver.get("https://www.simplilearn.com/");
		driver2.get("https://www.simplilearn.com/");
		
		//MAXIMING WINDOW SIZE
//		driver.manage().window().maximize();
		driver2.manage().window().maximize();
		
		//TIMEOUT SO THAT THE SELENIUM CAN FIND THE OTHER LINE TO EXECUTE COMMING NEXT
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver2.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Thread.sleep(10000);
	}
	@Parameters({"param1", "param2"})
	@Test(groups = {"Sanity"})
	public void LoginTestcase1(String UserNameVal, String PasswordVal){
		WebElement LoginLink = driver2.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		WebElement EmailId = driver2.findElement(By.name("user_login"));
		EmailId.sendKeys(UserNameVal);
		
		WebElement Pass = driver2.findElement(By.name("user_pwd"));
		Pass.sendKeys(PasswordVal);
		
		WebElement RememberMe = driver2.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		WebElement LoginButton = driver2.findElement(By.name("btn_login"));
		LoginButton.click();
		
		WebElement ErrorMsg = driver2.findElement(By.id("msg_box"));
		
		String ActMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		System.out.println("Actual: "+ActMsg);
		System.out.println("Expected: "+ExpMsg);
		
		Assert.assertEquals(ActMsg, ExpMsg);
		
		List<WebElement> Links = driver2.findElements(By.tagName("a"));
		System.out.println("Total count of Links: "+Links.size());
		
		for(int i=0; i<Links.size(); i++){
			System.out.println("href: "+Links.get(i).getAttribute("href"));
		}
		
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void TearDown(){
		driver2.close();
	}

}
