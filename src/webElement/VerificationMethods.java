package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethods {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("username"));
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		
		WebElement element1 = driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(element1.isSelected());
		
		Thread.sleep(3000);
		driver.close();

	}

}
