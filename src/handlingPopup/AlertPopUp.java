package handlingPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//If you don't scroll the page to some point in this page, u will get "element click intercepted" exception. Therefore use it.
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
				
		driver.findElement(By.name("B2")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		a.accept(); //(OK button)
		
		//If you try to click dismiss(Cancel Button), here it is not available, therefore it will throw exception.
		//a.dismiss();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
