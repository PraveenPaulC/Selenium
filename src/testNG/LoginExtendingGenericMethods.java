//The order of execution will be @BeforeMethod -> @Test -> @AfterMethod
package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Use inheritance of generic methods from generic class
public class LoginExtendingGenericMethods extends GenericMethods {
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");	
		driver.findElement(By.xpath("//div[text()='Login ']")).click();	
		
		Thread.sleep(2000);
		
		//Now we will verify using assert class
		
		String actual = driver.getTitle();
		Reporter.log(actual, true); //true to print on console
		
		String expected = "actiTIME - Entr Time-Track";
		
		
		Assert.assertEquals(actual, expected); //Hard Assert (contains Static Methos)
		Reporter.log("selenium", true); //If your condition passes in hard assert, the next line also gets executed 
										//and if it fails, then it terminates the exection and continues with AfterTest anotation
										//That is why we have used this statement to print.
		
		
		/*
		SoftAssert s = new SoftAssert(); //non static method so create an object and use
		s.assertEquals(actual, expected);
		Reporter.log("selenium", true); 
		s.assertAll(); //It is must for soft assert
		*/
		
	}

}
