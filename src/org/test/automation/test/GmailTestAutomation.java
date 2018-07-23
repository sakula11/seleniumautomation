package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTestAutomation extends BrowserManager 

{
	
	private GmailLoginAutomation login = new GmailLoginAutomation();
	
	private GmailComposeAutomation compose = new GmailComposeAutomation();
	
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
		
		    compose.clickgmailComposebutton();    
	        compose.texttoField();
			compose.textSubject();
			compose.textmessagebody();
			compose.clicksendButton();
			
			//Assert.assertTrue(compose.verifySuccessMessage());	
		}
		
		
}


