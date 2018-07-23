package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;
import org.test.automation.exception.GmailException;

public class GmailCompose extends BrowserManager{
		
	By composeButton= By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']");
	
	By toFieldTextBox=By.name("to");                               
	
	By subjectTextBox= By.name("subjectbox");
			
	By mailBody= By.className("editable");
	
	By sendButton=By.xpath("//*[text()='Send']");
	
	By successMessage = By.id("link_vsm");
	
	
	public void clickComposeButton() throws GmailException {
		
		Helper.click(composeButton);
		
	}
	
   public void selectToField() throws GmailException {
		
		Helper.click(toFieldTextBox);
		
	}
	
	public void enterTextToField() throws GmailException {
		Helper.enterText(toFieldTextBox, "aakula.sudhakar@gmail.com");
	}
	
	 public void selectsubjectField() throws GmailException {
			
			Helper.click(subjectTextBox);
			
		}

	 public void enterTextsubjectField() throws GmailException {
			Helper.enterText(subjectTextBox, "hi");
		}
	 
	 
	 public void selectmailBody() throws GmailException {
			
			Helper.click(mailBody);
			
		}

	 public void enterTextmailBody() throws GmailException {
			Helper.enterText(mailBody, "hi");
		}
	 
	 
	 
	 public void clickSend() throws GmailException {
		 Helper.click(sendButton);
	 }
	 
	 
	 public boolean verifySuccessMessage() throws GmailException
	 {
		 return Helper.isElementDisplayed(successMessage);
	 }
	 
	 
	 
}
