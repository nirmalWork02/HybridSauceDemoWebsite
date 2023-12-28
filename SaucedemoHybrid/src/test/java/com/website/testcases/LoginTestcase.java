package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LoginPage;

public class LoginTestcase extends BaseClass {
	
	
	@Test
	public void loginToApp() {	
		
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);
		login.loginSauce(excel.getStringData(1, 0, 0), excel.getStringData(1, 0, 1));
		
	}

}
