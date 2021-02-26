package com.hrms.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallalTestingTestNG {

	public WebDriver driver;

	@Test
	public void FirefoxTest() {
		// Initializing the firefox driver (Gecko)
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.demoqa.com");

	}

	@Test
	public void ChromeTest() {

		// Initialize the chrome driver

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com");

	}

	@Test
	public void fireFoxHeadlressDriver() {

		// Initialize the chrome driver

		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
		driver.get("https://www.demoqa.com");

	}

}
