package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		//SETUP FOR WEBDRIVER
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//DRIVER OBJECT
//		WebDriver driver = new ChromeDriver();
		WebDriver driver2 = new FirefoxDriver();
		
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

		WebElement LoginLink = driver2.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		WebElement EmailId = driver2.findElement(By.name("user_login"));
		EmailId.sendKeys("pal35swapnil35@fsd.com");
		
		WebElement Pass = driver2.findElement(By.name("user_pwd"));
		Pass.sendKeys("107@EnTC");
		
		WebElement RememberMe = driver2.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		WebElement LoginButton = driver2.findElement(By.name("btn_login"));
		LoginButton.click();
		
		WebElement ErrorMsg = driver2.findElement(By.id("msg_box"));
		
		String ActMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		System.out.println("Actual: "+ActMsg);
		System.out.println("Expected: "+ExpMsg);
		
		if(ActMsg.equals(ExpMsg)){
			System.out.println("Test Pass");
		}
		else{
			System.out.println("Test Fail");
		}
		
		List<WebElement> Links = driver2.findElements(By.tagName("a"));
		System.out.println("Total count of Links: "+Links.size());
		
		for(int i=0; i<Links.size(); i++){
			System.out.println("href: "+Links.get(i).getAttribute("href"));
		}
		
		driver2.close();
			
			

	}

}
