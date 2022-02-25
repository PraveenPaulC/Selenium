package section2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Praveen/Desktop/Food.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("Taj"));
		
		//We are using Select class and its methods, we give the address of the element as argument (element)
		Select s=new Select(element);
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("666");
		Thread.sleep(3000);
		s.selectByVisibleText("Chicken Curry");
		Thread.sleep(3000);
		s.deselectByIndex(3);
		
		System.out.println(s.isMultiple());
		Thread.sleep(3000);
		driver.close();
		

	}

}
