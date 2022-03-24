package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityExecutionOfAnotations {
	
	@Test(priority=2) //If priority is not specified, it will take by default 0
	public void calls()
	{
		Reporter.log("Calls",true);
	}
	
	@Test(invocationCount=3) //try here without giving priority, also you can give invocationCount=3 so that it will execute so many times
	public void settings()
	{
		Reporter.log("Settings",true);
	}
	
	@Test(priority=-1)
	public void Chat()
	{
		Reporter.log("Chat",true);
	}

}
