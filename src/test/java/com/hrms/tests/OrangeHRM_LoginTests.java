package com.hrms.tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.hrms.testBase.BaseClass;
import com.hrms.testBase.Driver;
import com.hrms.testBase.PageInitializer;
import com.hrms.utils.ConfigsReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_LoginTests extends BaseClass{

//	//WebDriver driver;
//
//	@BeforeMethod(alwaysRun = true)
//	public WebDriver setUp() {
//		return null;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(ConfigsReader.getProperty("url"));
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//	}

//	@AfterMethod(alwaysRun = true)
//	public void tearDown() {
//
//		driver.close();
//
//	}
	// 1. login using the valid credentials, and user should be able to successfully
	// login and see the dashboard/landing page

	// 2. try loging in using a valid username and invalid password, and user should
	// see "Invalid credentials"

	// 3. invalid username, valid password
	// 4. invalid username, invalid passord
	// 5. blank username , valid password
	// 6. valid username, blank password

	@Test(priority = 1, groups = { "login" })
	public void Login_ValidUsername_ValidPassword() {

		driver.findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("validUserName"));
		driver.findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("validPassWord"));
		driver.findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();

		String welcomeText = driver.findElement(By.id(ConfigsReader.getProperty("welcomeTextId"))).getText();

		String expectedWelcomeText = "Welcome Paul";

		AssertJUnit.assertEquals(welcomeText, expectedWelcomeText);

	}

	@Test(priority = 0, description = "Loging in with valid Username and Invalid password", groups = { "login" })
	public void Login_validUsername_InvalidPassword() {
		driver.findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("validUserName"));
		driver.findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("invalidPassword"));
		driver.findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();

		String invalidCredentialMessage = driver.findElement(By.id(ConfigsReader.getProperty("spanMessageError")))
				.getText();

		String expectedCredentialMessage = "Invalid credentials";

		AssertJUnit.assertEquals(invalidCredentialMessage, expectedCredentialMessage);

	}

	@Test
	public void logReportedTesting() {
		Reporter.log("Testing This Reporter");
		Reporter.log("Everyone here from TMT_BATCH5 will get a 100K job!!!");
	}

}
