package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;

public class GmailLogin extends BrowserManager {

	By usernameTextField = By.id("identifierId");

	By nextButton = By.xpath("//span[text()='Next']");

	By passwordTextField = By.name("password");
	
	By gmailComposeButton = By.xpath("//*[text()='COMPOSE']");

	public void enterGmailUserName() {
		Helper.enterText(usernameTextField, "testautomation988");
	}

	public void clickNextButton() {
		Helper.click(nextButton);
	}

	public void enterGmailPassword() {
		Helper.enterText(passwordTextField, "@1234five");
	}
	
	public boolean verifyComposeButtonIsDisplayed()
	{
		return Helper.isElementDisplayed(gmailComposeButton);
	}
}
