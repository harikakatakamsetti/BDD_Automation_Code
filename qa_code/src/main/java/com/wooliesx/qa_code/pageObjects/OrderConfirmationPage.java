package com.wooliesx.qa_code.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage extends BaseDriver {
	
	protected By orderConfirmation = By.cssSelector(".box .cheque-indent .dark");
	protected By orderHeader = By.cssSelector(".center_column .page-heading");

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
  public void orderConfirmationMess()
  {
	  String orderMsg = getText(orderConfirmation);
	  System.out.println(orderMsg);
  }
  
  public void validateOderHeader()
  {
	  isElementPresent(orderHeader);
  }
}
