//Web Driver methods getWindowHandle() & getWindowHandles() 
package handlingPopup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Scroll down to the required point to avoid exception
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		//To retrieve the parent adress, we use getWindowHandle() method
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//To retrieve the parent and child adress, we use getWindowHandles() method
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		//To close each window browser one by one, use foreach loop -It actually refreshes the page and closes from parent browser to child browser
		//bcoz getWindowHandles() returns parent address first & then child address
		/*for(String c:child)
		{
			driver.switchTo().window(c);
			Thread.sleep(3000);
			driver.close();
		}
		*/
		//To close child browser first, place the driver.close() outside the for-each loop.
		
		for(String c:child)
		{
			driver.switchTo().window(c);			
		}
		Thread.sleep(3000);
		driver.close();
		driver.quit(); //To finally close the parent window.
	}

}
