package handlingPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskSkillRary {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.linkText("COURSE"));
		
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		
		//Here you have the option of link text, but it won't work.. therefore use xpath
		
		driver.findElement(By.xpath("//a[text()='munit testing ']")).click();
		
		//Now performing Double click action on adding course by clicking on + button
		
		WebElement element1 = driver.findElement(By.id("add"));
		a.doubleClick(element1).perform();
		Thread.sleep(3000);
		
		WebElement element2 = driver.findElement(By.xpath("//button[@ondblclick='addtocart()']"));
		element2.click();
		
		Thread.sleep(3000);
		
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();

		
		Thread.sleep(3000);
		driver.quit();

	}

}
