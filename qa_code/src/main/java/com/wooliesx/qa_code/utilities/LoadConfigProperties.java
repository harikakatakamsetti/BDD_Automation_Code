package com.wooliesx.qa_code.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadConfigProperties {
	
    protected  Properties configProperties;
	
	private static LoadConfigProperties instance;
	public String filepath = System.getProperty("user.dir")+"\\src\\test\\resources\\testsuiteConfig\\";
	

	/**
	 * Constructor is made private and object can be accessible only by calling this static method
	 * 
	 * @return LoadConfigProperties singleton instance.
	 */
	public static LoadConfigProperties getInstance() {
		if(instance == null){
			instance = new LoadConfigProperties();
		}
		return instance;
	}

	/**
	 *  Loading properties files into Properties object
	 */
	private LoadConfigProperties() {
		configProperties = new Properties();
		InputStream inputStream = null;
		try {
			
			//Global Config
			  inputStream = new FileInputStream(filepath+"config.properties");

			if (inputStream != null) {
				configProperties.load(inputStream);
			} 
			
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public String getsiteUrl() {
		return configProperties.getProperty("siteurl");
	}

	public String getdriverpath() {
		return configProperties.getProperty("driverpath");
	}
	
	public String getBrowser() {
		return configProperties.getProperty("browser");
	}
	public String getApiKey() {
		return configProperties.getProperty("apikey");
	}
	public String getApiBaseUrl() {
		return configProperties.getProperty("apibaseurl");
	}

}
