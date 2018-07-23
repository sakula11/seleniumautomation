package org.test.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.test.automation.exception.GmailException;


public class Helper extends BrowserManager {
	
	public static WebElement getelement(By locator) throws GmailException
	{
		WebElement element = null;
		
		WebDriverWait wait = new WebDriverWait(_Driver, 15);
		try
		{
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
				element = _Driver.findElement(locator);
		}
		catch(TimeoutException toe)
		{
			throw new GmailException("Locator not available: "+locator);
		}
		
		return element;
		
	}
	
	public static void click(By locator) throws GmailException
	{
		getelement(locator).click();
	}
	
	public static void enterText(By locator,String value) throws GmailException
	{
		getelement(locator).sendKeys(value);
	}
	
	public static boolean isElementDisplayed(By locator) throws GmailException
	{
		return getelement(locator).isDisplayed();
	}

}
