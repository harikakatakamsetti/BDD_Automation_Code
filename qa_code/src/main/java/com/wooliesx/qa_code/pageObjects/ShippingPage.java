package com.wooliesx.qa_code.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage extends BaseDriver{
	
	protected By checkbox = By.cssSelector(".checker input");
	protected By deliveryoptn = By.className("delivery_options");
	protected By shippingOptn = By.className("carrier_title");

	public ShippingPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void validateDeliveryDisplayed()
	{
		isElementPresent(deliveryoptn);
	}
	
	public void validateShippingDetails()
	{
		String shippingdetails = getText(shippingOptn);
		System.out.println(shippingdetails);
	}
	
	public void accpectTermsAndCond()
	{
		if(isChecked(checkbox)==true)
		{
			System.out.println("check box is already checked");
		}
		else
		{
			clickElement(checkbox);
		}
	}
	

}
