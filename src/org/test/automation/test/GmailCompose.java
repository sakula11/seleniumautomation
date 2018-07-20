package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;

public class GmailCompose extends BrowserManager{
		
	By composeButton= By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']");
	
	By toFieldTextBox=By.name("to");                               
	
	By subjectTextBox= By.name("subjectbox");
			
	By mailBody= By.className("editable");
	
	By sendButton=By.xpath("//*[text()='Send']");
	
	By successMessage = By.id("link_vsm");
	
	
	public void clickComposeButton() {
		
		Helper.click(composeButton);
		
	}
	
   public void selectToField() {
		
		Helper.click(toFieldTextBox);
		
	}
	
	public void enterTextToField() {
		Helper.enterText(toFieldTextBox, "aakula.sudhakar@gmail.com");
	}
	
	 public void selectsubjectField() {
			
			Helper.click(subjectTextBox);
			
		}

	 public void enterTextsubjectField() {
			Helper.enterText(subjectTextBox, "hi");
		}
	 
	 
	 public void selectmailBody() {
			
			Helper.click(mailBody);
			
		}

	 public void enterTextmailBody() {
			Helper.enterText(mailBody, "hi");
		}
	 
	 
	 
	 public void clickSend() {
		 Helper.click(sendButton);
	 }
	 
	 
	 public boolean verifySuccessMessage()
	 {
		 return Helper.isElementDisplayed(successMessage);
	 }
	 
	 
	 
}
