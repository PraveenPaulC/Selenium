package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		PomStages p = new PomStages(driver); //Create an object of PomStages class
		WebElement element = driver.findElement(By.id("username"));
		driver.navigate().refresh(); //Passes a different adress of the browser to driver
		//element.sendKeys("admin"); gives StaleElementReferenceException therefore use the below statement
		p.demo("admin");
		
		Thread.sleep(2000);
		driver.close();

	}

}
