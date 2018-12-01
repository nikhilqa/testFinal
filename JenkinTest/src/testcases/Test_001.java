package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_001 {
	
	public WebDriver driver;
	@Test
	public void firstTest() {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.quit();
	}

}
