package com.hrms.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class loginTest {

	LoginPageElements loginPageObject = new LoginPageElements();
	DashboardPageElements dashBoardObject = new DashboardPageElements();

	@BeforeMethod
	public void setUp() {

		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest1() {
		
		

		loginPageObject.username.sendKeys(ConfigsReader.getProperty("validUserName"));
		loginPageObject.password.sendKeys(ConfigsReader.getProperty("validPassWord"));
		loginPageObject.loginBtn.click();
		
		//verify that you are on a dashboard page by verifying if the 'Subscribe' button is there. 

		
		System.out.println(dashBoardObject.subscriberLinkText.getAttribute("value"));
		
		
		Assert.assertEquals(dashBoardObject.subscriberLinkText.getAttribute("value"), "Subscribe");
	}
	
	

}
