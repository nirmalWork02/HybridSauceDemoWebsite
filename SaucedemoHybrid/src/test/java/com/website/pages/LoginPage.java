package com.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Login Page Elements of sauce Demo Page
	@FindBy(how=How.XPATH, using="//input[@id='user-name']")
	@CacheLookup
	WebElement uName;
	
	@FindBy(how=How.XPATH,using="//*[@name='password']")
	@CacheLookup
	WebElement pWord;
	
	@FindBy(how=How.ID, using="login-button")
	@CacheLookup
	WebElement submitBtn;
	
	
	
	
public void loginSauce(String usName, String psWord) {
	uName.sendKeys(usName);
	pWord.sendKeys(psWord);
	submitBtn.click();
	
}
}
