package section2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCount {
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
		
		//To check if it is a single or multiple dropdown
		boolean Check = s.isMultiple();
		System.out.println(Check);
		
		//To get a list of the dropdown options(items), we use getOptions method
		List<WebElement> options = s.getOptions();
		
		//To take a count of options and Print it
		int count = options.size();
		System.out.println(count);
		
		//Use For-each loop in java to print each and every drop down item using getText() method, here the syntax is
		
		for(WebElement b:options)
		{
			System.out.println(b.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
