package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) {
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
		
		TakesScreenshot obj = (TakesScreenshot) driver;
		File file = obj.getScreenshotAs(OutputType.FILE);
		
		try{
			FileUtils.copyFile(file, new File("image1.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		
		

	}

}
