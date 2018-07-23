package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;
import org.test.automation.exception.GmailException;

public class GmailComposeAutomation extends BrowserManager
{

	By gmailComposeButton = 
			//By.className("//div[text() = 'Compose'");
			
			By.xpath("//div[@class='z0']");
			
			//By.xpath("//div[text() = 'Compose']");
	
	By toField = By.name("to");
	
	By subject = By.name("subjectbox");
	
	By messageBody = By.className("editable");
	
	By sendButton = By.xpath("//*[text()='Send']");
	
	//By 
	
	public void clickgmailComposebutton() throws GmailException
	
	{
		Helper.click(gmailComposeButton);
	}
	
	public void texttoField() throws GmailException
	
	{
		Helper.enterText(toField, "praveen.lellela@kore.com");
	}
	
    public void textSubject() throws GmailException
	
	{
		Helper.enterText(subject, "This is the subject");
	}
	public void textmessagebody() throws GmailException
	
	{
		Helper.enterText(messageBody, "Hey guys...how r u???");
	}
	
	public void clicksendButton() throws GmailException
	{
		Helper.click(sendButton);
	}

	/*public boolean verifySuccessMessage() {
		return return ;
	}*/
}

