package com.wooliesx.qa_code.Hook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vimalselvam.cucumber.listener.Reporter;
import com.wooliesx.qa_code.utilities.LoadConfigProperties;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DriverHook {
	
	public static WebDriver driver;
	static LoadConfigProperties loadConfig;
	String baseUrl;
	String browser;
	 String driverpath;
	
	public DriverHook() {
		super();
		loadConfig = LoadConfigProperties.getInstance();
		baseUrl = loadConfig.getsiteUrl();
		driverpath = loadConfig.getdriverpath();
		browser = loadConfig.getBrowser();
		
		
	}
	
	
	/**
	 * This mehtod is used to setup driver instance 
	 * @author-Harika
	 */
	public WebDriver setDriver(){
		
	  switch(browser)
		{
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", driverpath+"\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver", driverpath+"\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
		
		return driver;
	}
	
	/**
	 * call this method to use driver instance 
	 * @author- Harika
	 */
	public WebDriver getDriver() {
		if(driver == null) 
			{
			driver = setDriver();
			}
		else
		{
			driver = setDriver();
		}
		return driver;
	}
	
	public WebDriver lanuchurl()
	{
		if(driver !=null)
		{
			driver.get(baseUrl);
		}
		return driver;
	}
	
	
	
		
	}



	

	
