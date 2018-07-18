package org.test.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserManager {

	protected static WebDriver _Driver = null;
	String CURRENTDIR = System.getProperty("user.dir");

	@BeforeMethod
	public void setup() throws Exception {
		getDriverObject("CHROME");

	}

	private WebDriver getDriverObject(String browserName) throws Exception {

		switch (browserName) {
		case "CHROME":

			System.setProperty("webdriver.chrome.driver", CURRENTDIR + "\\ExecutableDrivers\\chromedriver.exe");
			_Driver = new ChromeDriver();
			break;
		case "FIREFOX":
			break;
		default:
			throw new Exception("Invalid browserName");
		}
		return _Driver;

	}

	@AfterMethod
	public void tearDown() {
//		_Driver.close();
//		_Driver.quit();

	}

}
