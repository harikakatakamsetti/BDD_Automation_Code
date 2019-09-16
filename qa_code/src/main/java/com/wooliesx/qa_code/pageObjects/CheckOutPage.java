package com.wooliesx.qa_code.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CheckOutPage extends BaseDriver {

	protected By deliveryHeader = By.cssSelector(".address_delivery");
	protected By billingAddressCheckbox = By.className("checker");
	protected By deliveryAddressHeader = By.cssSelector("#address_delivery .address_title");
	protected By invioceAddressHeader = By.cssSelector("#address_invoice .address_title");
	protected By emailaddressdropdowm = By.id("id_address_delivery");
	
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void validateEmailAddress() {
		String useremail = null;
		if(getOptionsForDropDown(emailaddressdropdowm)!=null)
		{
			for(int i=1;i<getOptionsForDropDown(emailaddressdropdowm).size();i++)
			{
				
			if(getOptionsForDropDown(emailaddressdropdowm).get(i).getText().equals("tester01@gmail.com"))
			{
				 useremail = getOptionsForDropDown(emailaddressdropdowm).get(i).getText();
				 break;
				}
			}
		}
		if(useremail!=null) {
		Assert.assertEquals(useremail, "tester01@gmail.com");
		}
		
	}
	public void validateDeliveryAddress()
	{
		isElementPresent(deliveryHeader);
		isElementPresent(deliveryAddressHeader);
	}
	
	public void validateInvoiceAddress()
	{
		isElementPresent(invioceAddressHeader);
	}

}
