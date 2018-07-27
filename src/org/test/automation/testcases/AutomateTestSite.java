package org.test.automation.testcases;

import org.test.automation.base.BrowserManager;
import org.test.automation.base.Helper;
import org.test.automation.exception.GmailException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateTestSite extends BrowserManager{
	
	AutomateSitePage page = new AutomateSitePage();
	
	@Test
	public void TC_testFileUpload() throws GmailException
	{
		navigateToURL("http://the-internet.herokuapp.com");
		page.clickFileUploadLink();
		
		Assert.assertTrue(page.verifyUploadButton());
		
		Helper.navigateBack();
		
	}
	
	@Test(dependsOnMethods= {"TC_testFileUpload"})
	public void TC_testCheckboxes() throws GmailException
	{
		page.clickCheckBoxesLink();
		
		Assert.assertTrue(page.VerifyCheckBoxSelected());
		
		Helper.navigateBack();
		
	}
	
	

}