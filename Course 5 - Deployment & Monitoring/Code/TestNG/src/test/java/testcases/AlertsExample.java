package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		//SETUP FOR WEBDRIVER
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//DRIVER OBJECT
		WebDriver driver = new ChromeDriver();
//		WebDriver driver2 = new FirefoxDriver();
		
		//EXAMPLE SITE OPENING
		driver.get("https://demoqa.com/alerts");
//		driver2.get("https://www.facebook.com/");
		
		//MAXIMING WINDOW SIZE
		driver.manage().window().maximize();
//		driver2.manage().window().maximize();
		
		//TIMEOUT SO THAT THE SELENIUM CAN FIND THE OTHER LINE TO EXECUTE COMMING NEXT
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//		driver2.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Btn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		Btn1.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(1000);
		
		WebElement Btn2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		Btn2.click();
		Thread.sleep(2000);
		alert = driver.switchTo().alert();
		alert.dismiss();
		
		Thread.sleep(1000);
		
		WebElement Btn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		Btn3.click();
		Thread.sleep(2000);
		alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.sendKeys("Message");
		Thread.sleep(1000);
		alert.accept();
		
		
		

	}

}
