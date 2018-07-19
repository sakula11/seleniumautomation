package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTest extends BrowserManager {
	
	private GmailLogin login = new GmailLogin();
	
	@Test
	public void testGmailLogin() throws InterruptedException
	{
		_Driver.get("https://mail.google.com");
		
		try
		{
		
			_Driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		}
		catch(Exception e)
		{
			
		}
		
		login.enterGmailUserName();
		login.clickNextButton();
		login.enterGmailPassword();
		login.clickNextButton();
		
		Assert.assertTrue(login.verifyComposeButtonIsDisplayed());
	}

}
