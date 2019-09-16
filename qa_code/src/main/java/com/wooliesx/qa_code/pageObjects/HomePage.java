package com.wooliesx.qa_code.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseDriver {
	
	protected By searchBar = By.cssSelector("#search_query_top");
	protected By magnifyingIcon = By.cssSelector(".button-search");
	

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	/**
	 * This method is used to search for
	 * product using product name
	 * @param productName
	 * @author Harika_Katakamsetti
	 */
	public void searchFor(String productName)

	{
		try {
			if(driver!=null)
			{
				enterText(searchBar,productName);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickOnSeacrchIcon()
	{
		clickElement(magnifyingIcon);
	}
}
