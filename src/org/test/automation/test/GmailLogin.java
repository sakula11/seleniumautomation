package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.testng.annotations.Test;

public class GmailLogin extends BrowserManager{
	
	
	@Test
	public void testGmailLogin()
	{
		_Driver.get("https://mail.google.com");
		
		_Driver.findElement(By.linkText("Sign In")).click();
		


		
		
	}

}
