package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.testCases.BaseClass;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("entered username");
		
		lp.setPassword(password);
		logger.info("entered password");
		
		lp.clickSubmit();
		logger.info("clicked on submit button");
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
		} else {
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
	}

}
