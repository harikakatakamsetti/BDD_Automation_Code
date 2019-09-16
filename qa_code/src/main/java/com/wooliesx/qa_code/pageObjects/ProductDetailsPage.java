package com.wooliesx.qa_code.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class ProductDetailsPage extends BaseDriver {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	protected By addToCart = By.cssSelector("#add_to_cart button");
	protected By productName = By.cssSelector(".pb-center-column h1");
	protected By price = By.cssSelector("#our_price_display");
	
	
	/**
	 * This method is used to add
	 * product to cart from
	 * Product Details Page
	 * @author Harika_Katakamsetti
	 */
	public void addToCart()
	{
		try {
			if(driver!=null)
			{
				clickElement(addToCart);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void assertProductName(String item)
	{
		try
		{
			if(driver!=null)
			{
				System.out.println(getText(productName));
				System.out.println(item);
			 Assert.assertEquals(getText(productName), item); 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean pageIsLoaded()
	{
		boolean flag = false;
		try
		{
			
			isElementPresent(productName);
			return flag =true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	

}
