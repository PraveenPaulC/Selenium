package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicTestNGReport {
	@Test
	public void demo()
	{
		Reporter.log("Selenium",true); //If false is given, it will not print on console as "Passed:demo", it will print in emailable report present in test-output folder
	}

}
