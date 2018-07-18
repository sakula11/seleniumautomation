package org.test.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper extends BrowserManager {
	
	public static WebElement getelement(By locator)
	{
		WebElement element = null;
		
		WebDriverWait wait = new WebDriverWait(_Driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		element = _Driver.findElement(locator);
		
		return element;
		
	}
	
	public static void click(By locator)
	{
		getelement(locator).click();
	}
	
	public static void enterText(By locator,String value)
	{
		getelement(locator).sendKeys(value);
	}
	
	public static boolean isElementDisplayed(By locator)
	{
		return getelement(locator).isDisplayed();
	}

}
