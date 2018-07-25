package org.test.automation.test;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;
import org.test.automation.exception.GmailException;
import org.test.automation.utils.PropertyReader;

public class GmailLoginPage extends BrowserManager {

	By usernameTextField = By.id("identifierId");

	By nextButton = By.xpath("//span[text()='Next']");

	By passwordTextField = By.name("password");
	
	By gmailComposeButton = By.xpath("//*[text()='COMPOSE']");

	public void enterGmailUserName() throws GmailException, FileNotFoundException {
		log.info("Enter username");
		Helper.enterText(usernameTextField, PropertyReader.getProperty("gmailUserName"));
	}

	public void clickNextButton() throws GmailException {
		log.info("click next button");
		Helper.click(nextButton);
	}

	public void enterGmailPassword() throws GmailException, FileNotFoundException {
		log.info("Enter password");
		Helper.enterText(passwordTextField, PropertyReader.getProperty("gmailPassword"));
	}
	
	public boolean verifyComposeButtonIsDisplayed() throws GmailException
	{
		log.info("Check whether Gmail Compose button is displayed");
		return Helper.isElementDisplayed(gmailComposeButton);
	}
}
