package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroweserFactory {
	static WebDriver driver;
	public static WebDriver unit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abasi\\eclipse-workspace\\BDD\\BDD3\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebDriver Teardown() {
		driver.close();
		driver.quit();
		return driver;
	}

}
