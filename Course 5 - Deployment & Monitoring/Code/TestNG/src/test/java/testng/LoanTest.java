package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoanTest {
	
	@BeforeTest
	public void method3(){
		System.out.println("Inside before Test");
	}
	
	@BeforeMethod
	public void method1(){
		System.out.println("Inside method1");
	}
	
	@Test(groups = {"Sanity"}, priority=0, description="This test is for Home Loan")
	public void HomeLoanTest(){
		System.out.println("Inside HomeLoan Test");
	}
	
	@Test(enabled=true, priority=1, description="This test is for Car Loan")
	
	public void CarLoanTest(){
		System.out.println("Inside CarLoan Test");
	}
	
	@AfterMethod
	public void method2(){
		System.out.println("Inside method2");
	}
	
	@AfterTest
	public void method4(){
		System.out.println("Inside after Test");
	}
}
