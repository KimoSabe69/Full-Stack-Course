package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) {
		//SETUP FOR WEBDRIVER
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//DRIVER OBJECT
		WebDriver driver = new ChromeDriver();
//		WebDriver driver2 = new FirefoxDriver();
		
		//EXAMPLE SITE OPENING
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		driver2.get("https://www.facebook.com/");
		
		//MAXIMING WINDOW SIZE
		driver.manage().window().maximize();
//		driver2.manage().window().maximize();
		
		//TIMEOUT SO THAT THE SELENIUM CAN FIND THE OTHER LINE TO EXECUTE COMMING NEXT
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//		driver2.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement ScrollTo = driver.findElement(By.xpath("//h2[text()='Table Rows']"));
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		jsObj.executeScript("arguments[0].scrollIntoView()", ScrollTo);

	}

}
