package section2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDropDown {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("gh-cat"));
		Select s=new Select(element);
		
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("3252");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
