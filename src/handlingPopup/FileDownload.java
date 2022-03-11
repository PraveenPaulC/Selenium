package handlingPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("4.1.2")).click();
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_LEFT); 
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.close();
	}

}
