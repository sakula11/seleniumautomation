package org.test.automation.test;

import org.openqa.selenium.By;
import org.test.automation.base.BrowserManager;
import org.test.automation.exception.GmailException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTest extends BrowserManager {

	private GmailLoginPage login = new GmailLoginPage();

	private GmailComposePage gmailCompose = new GmailComposePage();

	@Test
	public void testGmailLogin() throws InterruptedException, GmailException {

		try {

			_Driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		} catch (Exception e) {

		}

		login.enterGmailUserName();
		login.clickNextButton();
		login.enterGmailPassword();
		login.clickNextButton();

		Assert.assertTrue(login.verifyComposeButtonIsDisplayed());

		gmailCompose.clickComposeButton();
		gmailCompose.enterEmailIDsInToField();
		gmailCompose.enterSubject();
		gmailCompose.enterEmailBody();
		gmailCompose.clickSendButton();

		Assert.assertTrue(gmailCompose.verifySuccessMessage());

	}

}
