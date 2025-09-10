package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;
import com.utility.LoggerUtility;

public final class LoginPage extends BrowserUtility{
	
	Logger logger = LoggerUtility.getLogger(this.getClass());
	
	private static final By emailTextBoxLocator = By.id("email");
	private static final By passWordTextLocator = By.id("passwd");
	private static final By submitLoginButtonLocator = By.id("SubmitLogin");


	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public MyAccountPage doLoginWith(String emailAddress, String password) {
		logger.info("Entering credentials");
		enterText(emailTextBoxLocator, emailAddress);
		enterText(passWordTextLocator, password);
		clickOn(submitLoginButtonLocator);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
	}

	
}
