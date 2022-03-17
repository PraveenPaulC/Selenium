package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomStages {
	
	//Stage 1: Declaratiom
	@FindBy(id="username")
	private WebElement usernameTb;
	
	//Stage 2 : Initialization
	PomStages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Stage 3 : Utilization
	public void demo(String un)
	{
		usernameTb.sendKeys(un);
	}

}
