package testng;

import org.testng.annotations.Test;

public class CardTest {
	
	@Test(groups = {"Sanity"})

	public void CreditCardTest(){
		System.out.println("Inside CC Test");
	}

}
