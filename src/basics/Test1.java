package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		String key = ("webdriver.gecko.driver");
		String value = ("./drivers/geckodriver.exe");
		
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		
		Thread.sleep(5000);
		driver.close();

	}

}
