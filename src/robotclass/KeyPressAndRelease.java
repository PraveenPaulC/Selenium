package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressAndRelease {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); //Key event is used inorder to indicate that key should be pressed & VK is for virtual keyboard
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(3000);
		driver.close(); //closes only current working web driver.
		
		driver.quit(); //closes the entire window

	}

}
