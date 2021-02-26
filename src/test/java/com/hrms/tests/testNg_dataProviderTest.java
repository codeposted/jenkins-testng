package com.hrms.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class testNg_dataProviderTest {
//
//	@BeforeMethod(alwaysRun = true)
//	public void setUp() {
//
//		Driver.getDriver().get(ConfigsReader.getProperty("url"));
//		Driver.getDriver().manage().window().maximize();
//		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//	}

	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "Kanin" }, { "Park" },{ "Gift" } };
	}
	
	

	@Test(dataProvider = "data-provider")
	public void myTest(String val) {
		System.out.println("My Name : " + val);
		
		
	}

}
