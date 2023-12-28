package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.website.utilities.BrowserFactory;
import com.website.utilities.ConfigProvider;
import com.website.utilities.ExcelDataProv;
import com.website.utilities.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProv excel;
	public ConfigProvider confPro;
	
	@BeforeSuite
	public void suiteSetUp() {
		 excel = new ExcelDataProv();
		 confPro = new ConfigProvider();
	}
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startBrowser(driver, confPro.getBrowserData() , confPro.getConfigData("Url"));
	}
	
	@AfterClass
	public void closeSetup() {
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			Helper.captureScreenshot(driver, "Failure 1");
			Helper.captureScreenshot(driver);
		}
	}
}
