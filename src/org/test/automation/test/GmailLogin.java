package org.test.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;
import org.testng.annotations.Test;

public class GmailLogin extends BrowserManager{
	
	
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
		
		//_Driver.findElement(By.linkText("Sign In")).click();
		
		Helper.enterText(By.id("identifierId"), "testautomation");
		
		Helper.click(By.xpath("//span[text()='Next']"));
		
		Helper.enterText(By.name("password"), "tested");
		
		Helper.click(By.xpath("//span[text()='Next']"));
		
		
		
		
		


		
		
	}

}
