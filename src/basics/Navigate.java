package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
