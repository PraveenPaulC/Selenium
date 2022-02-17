package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginScript {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();		
		
		
		//Verification of the result
		String ExpectedResult = "actiTIME -  Enter Time-Track";
		String ActualResult = driver.getTitle();
		System.out.println(ActualResult);
		
		if(ExpectedResult.equals(ActualResult))
		{
			System.out.println("Pass: HomePage is displayed");
		}
		else
		{
			System.out.println("Fail : Username or Password is invalid. Please try again. message is displayed");
		}
		
		Thread.sleep(10000);
		driver.close();

	}

}
