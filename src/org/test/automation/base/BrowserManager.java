package org.test.automation.base;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.automation.exception.GmailException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserManager {

	protected static WebDriver _Driver = null;
	protected static String CURRENTDIR = System.getProperty("user.dir");
	public static Logger log = Logger.getLogger(BrowserManager.class);
	public static String baseURL = "https://mail.google.com";

	@BeforeMethod
	public void setup() throws Exception {
		File logsFolder = new File(CURRENTDIR + "//logs");
		File reportsDir = new File(CURRENTDIR + "/Reports");

		if (!logsFolder.exists()) {
			logsFolder.mkdirs();
		}

		if (!reportsDir.exists()) {
			reportsDir.mkdirs();
		}

		PropertyConfigurator.configure("log4j.properties");
		startBrowser("CHROME");
		navigateToURL(baseURL);

	}

	private void navigateToURL(String url) {
		
		_Driver.get(url);
		
	}

	private WebDriver startBrowser(String browserName) throws GmailException {

		switch (browserName) {
		case "CHROME":

			System.setProperty("webdriver.chrome.driver", CURRENTDIR + "\\ExecutableDrivers\\chromedriver.exe");
			_Driver = new ChromeDriver();
			break;
		case "FIREFOX":
			break;
		default:
			throw new GmailException("Invalid browserName");
		}
		return _Driver;

	}

	@AfterMethod
	public void tearDown() {
		_Driver.close();
		_Driver.quit();

	}

}
