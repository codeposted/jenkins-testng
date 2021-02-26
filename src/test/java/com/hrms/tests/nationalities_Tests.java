package com.hrms.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.pages.AdminPageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.NationalityPageElements;
import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class nationalities_Tests {
	
	Actions action = new Actions(Driver.getDriver());
	
	LoginPageElements loginPageObject = new LoginPageElements();
	DashboardPageElements dashBoardObject = new DashboardPageElements();
	AdminPageElements adminPageObject = new AdminPageElements();
	NationalityPageElements nationalityPage = new NationalityPageElements();

	@BeforeMethod
	public void setUp() {

		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void addNationality() throws InterruptedException {
		
//		Enter valid username
//		enter Valid password
//		Click on login button

		loginPageObject.username.sendKeys(ConfigsReader.getProperty("validUserName"));
		loginPageObject.password.sendKeys(ConfigsReader.getProperty("validPassWord"));
		loginPageObject.loginBtn.click();
		
		//verify that you are on a dashboard page by verifying if the 'Subscribe' button is there. 

		
		System.out.println(dashBoardObject.subscriberLinkText.getAttribute("value"));
		
		
		Assert.assertEquals(dashBoardObject.subscriberLinkText.getAttribute("value"), "Subscribe");
		
		
//		hover over adminPage
		
		
		
		dashBoardObject.AdminPageButton.click();
		
		
//		Click on Nationality Tab and click add
		
		adminPageObject.nationalityTab.click();
		
		//adminPageObject.nationalityTab.click();
		
	
		adminPageObject.addButton.click();
		
		
//		enter country and click add
		
		nationalityPage.nationalityInputBox.sendKeys(ConfigsReader.getProperty("country"));
		nationalityPage.saveButton.click();
		
		
//		User Sees the country added  and its in the list
		
		for (WebElement eachCountry : nationalityPage.nationalityList) {
			
			System.out.println(eachCountry.getText());
			
		}
		
		
		
		
		
		//
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
