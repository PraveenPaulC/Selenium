package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
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
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleContains("Enter123"));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("container_reports")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
