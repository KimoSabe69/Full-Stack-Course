package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginTest {

	public static void main(String[] args) throws InterruptedException {
		//SETUP FOR WEBDRIVER
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//DRIVER OBJECT
		WebDriver driver = new ChromeDriver();
//		WebDriver driver2 = new FirefoxDriver();
		
		//EXAMPLE SITE OPENING
		driver.get("https://www.facebook.com/");
//		driver2.get("https://www.facebook.com/");
		
		//MAXIMING WINDOW SIZE
		driver.manage().window().maximize();
//		driver2.manage().window().maximize();
		
		//TIMEOUT SO THAT THE SELENIUM CAN FIND THE OTHER LINE TO EXECUTE COMMING NEXT
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//		driver2.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		WebElement TextSrch = driver.findElement(By.xpath("//h2[contains(text(),'share with the people')]"));
		WebElement TextSrchStrt = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook')]"));
		WebElement Input = driver.findElement(By.xpath("//form/div/div/input"));
		
		
//		UserName.sendKeys("abcxyz");
//		Password.sendKeys("pqrstu");
//		LoginBtn.click();
		
		Thread.sleep(30000);
		driver.close();


	}

}
