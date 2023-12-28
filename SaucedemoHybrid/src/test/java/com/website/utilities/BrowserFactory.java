package com.website.utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver startBrowser(WebDriver driver, String browserName, String appUrl ) {
		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Enter a valid Browser");
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}
