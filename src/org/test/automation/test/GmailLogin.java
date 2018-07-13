package org.test.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.test.automation.base.BrowserManager;
import org.testng.annotations.Test;

public class GmailLogin extends BrowserManager{
	
	
	@Test
	public void testGmailLogin()
	{
		_Driver.get("https://mail.google.com");
		
		WebDriverWait wait = new WebDriverWait(_Driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Sign In")));
		
		
		//xpath
		
//		_Driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		_Driver.findElement(By.linkText("Sign In")).click();
		
		_Driver.findElement(By.id("identifierId")).sendKeys("testautomation");
		
		_Driver.findElement(By.xpath("//span[text()='Next']")).click();		
		
		_Driver.findElement(By.name("password")).sendKeys("tested");
		
		_Driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		
		


		
		
	}

}
