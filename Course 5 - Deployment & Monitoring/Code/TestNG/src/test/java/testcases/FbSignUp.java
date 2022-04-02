package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
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
		
		WebElement NewAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		NewAccount.click();
		
		WebElement dDOB = driver.findElement(By.id("day"));
		Select ddDOB = new Select(dDOB);
		ddDOB.selectByVisibleText("22");
		
		WebElement mDOB = driver.findElement(By.id("month"));
		Select mmDOB = new Select(mDOB);
		mmDOB.selectByVisibleText("Jan");
		
		List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
		for(int i=0; i<Months.size(); i++){
//			System.out.println(Months.get(i).getText());
		}
		
//		WebElement RadioGender = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		
		String GenVal = "Female";
		String GenXpath = "//label[text()='"+GenVal+"']/following-sibling::*";
		WebElement RadioGender = driver.findElement(By.xpath(GenXpath));
		RadioGender.click();
		
		
	}

}
