package com.wooliesx.qa_code.pageObjects;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseDriver {
	protected WebDriver driver;
	
	public BaseDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * This method is used to perform click action using
	 * @param by
	 * @author-Harika
	 */
	public void clickElement(By by)
	{
		if(driver!=null)
		{
			driver.findElement(by).click();
		}
	}
	
	/**
	 * This method is used for sending text
	 * @param by
	 * @param input
	 * @author-Harika
	 */
	public void enterText(By by,String input)
	{
		if(driver!=null)
		{
			WebElement element = driver.findElement(by);
			element.clear();
			element.sendKeys(input);
		}
	}

	/**
	 * This method is used for check box usin
	 * @param by
	 * @return boolean
	 * @author-Harika
	 */
	public Boolean isChecked(By by)
	{
		boolean flag = false;
		
			WebElement radiobtn = driver.findElement(by);
			if(radiobtn.isSelected())
			{
				flag =true;
			}
			return flag;
		
	}

	/**
	 * This method is used for list of webelements using
	 * @param by
	 * and @returns list
	 * @author-Harika
	 */
	public List<WebElement> getList(By by)
	{
		List<WebElement> lst = driver.findElements(by);
		 return lst;
	}
	
	/**
	 * This method is used to get web element text using
	 * @param by
	 *  and @return string value
	 *  @author-Harika
	 */
	public String getText(By by) {
		WebElement element=null;
		if(driver!=null)
		{
			 element = driver.findElement(by);
			}
		return element.getText();
	}
	
	/**
	 * This method is used to identified element
	 * is present using
	 * @param by
	 * and @return boolean value
	 * @author-Harika
	 */
	public boolean isElementPresent(By by)
	{
		try
		{
			driver.findElement(by).isDisplayed();
			return true;
		}
		catch (NoSuchElementException e)
		{
			return false;
		}

	}
	
	/**
	 * This method is used for explicit wait using
	 * @param by
	 * @param timeout
	 * @author-Harika
	 */
	public void waitForElementPresent(By by, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		
	}
	
	/**
	 * This method is used to
	 * click on webElement using JS click
	 * @param by
	 * @author Harika
	 */
	public void jsClick(By by)
	{
		WebElement element = driver.findElement(by);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	/**
	 *This method is used find element using
	 * @param by
	 * @return element
	 * @author-Harika
	 */
	public WebElement getWebElement(By by)
	{
		WebElement element;
		element = driver.findElement(by);
		return element;
	}
	
	/**
	 * This method is used for handling dropdowns using
	 * @param by
	 * and @returns list of dropdown values
	 * @author-Harika
	 */
	public List<WebElement> getOptionsForDropDown(By by) {
		List<WebElement> selectOptions = null;
		try {
			WebElement selectLink = getWebElement(by);
			Select select = new Select(selectLink);
			selectOptions = select.getOptions();
		} catch (Exception e) {
			
		} 
		return selectOptions;
	}
	
	
}
