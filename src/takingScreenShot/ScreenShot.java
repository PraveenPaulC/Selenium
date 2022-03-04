package takingScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		TakesScreenshot S =(TakesScreenshot) driver; //Use TakesScreenshot interface in java-selenium arch and TypeCast driver.
		
		//Use getScreenshotAs() & Specify the Output type to capture screenshot, selenium understands only File but java knows other o/p types too.
		File src = S.getScreenshotAs(OutputType.FILE); 
		
		File dest = new File("./photo/myntra.png"); //paste it to dest created in your project
		
		FileUtils.copyFile(src, dest); //copy paste from src to dest
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
