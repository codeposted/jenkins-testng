package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.BaseClass;
import com.hrms.testBase.Driver;
import com.hrms.utils.CommonMethods;


public class DashboardPageElements extends CommonMethods{

	@FindBy(id = "welcome")
	public WebElement welcome;

	@FindBy(id = "Subscriber_link")
	public WebElement subscriberLinkText;

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement AdminPageButton;

	@FindBy(xpath = "")
	public List<WebElement> dashMenu;
	//*[@id="resultTable"]/tbody/tr[*]
	
	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement PIMButton;
	
	

	public DashboardPageElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public void navigateToAddEmployee() {
	
		
	}
	
}