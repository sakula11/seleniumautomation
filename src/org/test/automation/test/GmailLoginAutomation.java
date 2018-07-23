package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;
import org.test.automation.exception.GmailException;

public class GmailLoginAutomation extends BrowserManager {

	By usernameTextField = By.id("identifierId");

	By nextButton = By.xpath("//span[text()='Next']");

	By passwordTextField = By.name("password");
	
	By gmailComposeButton = By.xpath("//*[text()='COMPOSE']"); 
	

	public void enterGmailUserName() throws GmailException {
		Helper.enterText(usernameTextField, "praveen.lellela@kore.com");
	}

	public void clickNextButton() throws GmailException {
		Helper.click(nextButton);
	}

	public void enterGmailPassword() throws GmailException {
		Helper.enterText(passwordTextField, "kore123$");
	}

	public boolean verifyComposeButtonIsDisplayed() throws GmailException {
		return Helper.isElementDisplayed(gmailComposeButton);
	}
}
