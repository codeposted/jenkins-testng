package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.BaseClass;
import com.hrms.testBase.Driver;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginPageElements  {

	public LoginPageElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	// Not using PageFactory, You have to extend CommonMethods or BaseClass
	// public WebElement username2=driver.findElement(By.id("txtUsername"));

	// Using PageFactory and @FindBy Annotation
	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(name = "txtPassword")
	public WebElement password;

	@FindBy(id = "btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "")
	public WebElement logo;

	@FindBy(id = "")
	public WebElement errorMsg;

	// if we would be keeping elements as private
	// then we will need to create public getters and setters
	// so we can access page elements from test classes

	// setter
	public void sendUsername(String uid) {
//		sendText(username, uid);
	}

	// getter
	public WebElement getUsername() {
		return username;
	}

	public void login(String uid, String pwd) {

	}

}