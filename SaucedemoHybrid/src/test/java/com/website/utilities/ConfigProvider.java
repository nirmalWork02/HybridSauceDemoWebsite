package com.website.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigProvider {
	public Properties pro;
	public ConfigProvider() {
		File src = new File("./Config/Conf.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found "+e.getMessage());
			e.printStackTrace();
		}
		
	}

	public String getConfigData(String KeyToSearch) {
		return pro.getProperty(KeyToSearch);
		
	}
	
	public String getBrowserData() {
		return pro.getProperty("Browser");
	}
	
	public String getAppUrl() {
		return pro.getProperty("Url");
	}
}
