package org.test.automation.testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;
import org.testng.annotations.Test;


public class TestGoogle extends BrowserManager {
	
	@Test
	public void testGoogle()
	{
		_Driver.get("https://www.google.co.in/");
		Helper.waitForPageLoaded();
		
		List<WebElement> listOfLinks = _Driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> it = listOfLinks.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
	}

}
