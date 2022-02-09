package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException 
	{
		String key = ("webdriver.chrome.driver");
		String value = ("./drivers/chromedriver.exe");
		
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
