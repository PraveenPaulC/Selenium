package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettersMethod2 {
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
		
		int Height = element.getSize().getHeight();
		System.out.println(Height);
		
		int Width = element.getSize().getWidth();
		System.out.println(Width);
		
		System.out.println(element.getLocation().getX());
		System.out.println(element.getLocation().getY());
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
