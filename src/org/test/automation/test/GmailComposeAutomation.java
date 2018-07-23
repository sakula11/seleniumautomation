package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;

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
	
	public void clickgmailComposebutton()
	
	{
		Helper.click(gmailComposeButton);
	}
	
	public void texttoField()
	
	{
		Helper.enterText(toField, "praveen.lellela@kore.com");
	}
	
    public void textSubject()
	
	{
		Helper.enterText(subject, "This is the subject");
	}
	public void textmessagebody()
	
	{
		Helper.enterText(messageBody, "Hey guys...how r u???");
	}
	
	public void clicksendButton()
	{
		Helper.click(sendButton);
	}

	/*public boolean verifySuccessMessage() {
		return return ;
	}*/
}

