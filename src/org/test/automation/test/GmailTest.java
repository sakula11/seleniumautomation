package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTest extends BrowserManager {
	
	private GmailLogin login = new GmailLogin();
	
	private GmailCompose gmailCompose=new GmailCompose();
	
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
		
		gmailCompose.clickComposeButton();
		gmailCompose.selectToField();
		gmailCompose.enterTextToField();
		gmailCompose.enterTextsubjectField();
		gmailCompose.selectmailBody();
		gmailCompose.enterTextmailBody();
		gmailCompose.clickSend();
		
		Assert.assertTrue(gmailCompose.verifySuccessMessage());
		
		
	}

}
