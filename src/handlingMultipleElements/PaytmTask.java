//Handling Frames
package handlingMultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmTask {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		//1) using switchTo() method by passing frame index
		//driver.switchTo().frame(0);
				
		
		//2) using Web Element and passing ref variable to frame, locating with iframe attribute as the developers use it to develop frames
		
		WebElement element = driver.findElement(By.xpath("//iframe[@scrolling='no']"));
		driver.switchTo().frame(element);
		
		driver.findElement(By.xpath("//span[contains(text(), 'Google Play')]")).click();
				
		Thread.sleep(3000);
		driver.quit();

	}

}
