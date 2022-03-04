//Handling Auto Suggestions
package handlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodAndCount {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("seleni");
		Thread.sleep(3000);
		
		//locate the elements using find elements method by passing Xpath by attribute locator
		
		List<WebElement> element1 = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		//Take a count of listed elements and print
		int count = element1.size();
		System.out.println(count);
		
		//Print each element by getting the name using for-each loop with the help of getText() method
		for(WebElement b:element1)
		{
			System.out.println(b.getText());
		}
		
		//select the option to search from suggestion by passing index
		element1.get(2).click();
		
		Thread.sleep(3000);
		driver.close(); 
		
	}

}
