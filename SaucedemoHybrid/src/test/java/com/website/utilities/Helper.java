package com.website.utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File( "./ScreenShots/"+screenshotName+".png"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The error is "+e.getMessage());
		}
	
	}
	
	public static void captureScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			
			FileHandler.copy(src, new File("./ScreenShots/"+getCurrentDateTime() +".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The error is "+e.getMessage());
		}
	}
	
	public static String  getCurrentDateTime() {
			DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			Date currentDate=new Date();
			return customFormat.format(currentDate);
			
		}

}
