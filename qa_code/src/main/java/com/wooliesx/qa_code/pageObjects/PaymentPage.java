package com.wooliesx.qa_code.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends BaseDriver{
	
	protected By paymentHeader = By.cssSelector(".center_column .page-heading");
	protected By paymentOption = By.cssSelector(".payment_module a");
	protected By paymentInfo = By.cssSelector(".box .page-subheading");
	public PaymentPage(WebDriver driver) {
		super(driver);
    }
	
	public void validatePaymentHeader()
	{
		isElementPresent(paymentHeader);
	}
	
	public void paymentInfoDisplay()
	{
		isElementPresent(paymentInfo);
	}
	public List<WebElement> getpaymentoptions() {
		 return getList(paymentOption);
		
	}

	public void selectPaymentOption(String option) throws Exception
	{
		if(getpaymentoptions()!=null)
		{
			
			 System.out.println(getpaymentoptions().size());
			 Thread.sleep(1000);
			 for(int i=0;i<getpaymentoptions().size();i++) {
			  
			  
			  if(getpaymentoptions().get(i).getText().contains(option)) {
				  System.out.println(getpaymentoptions().get(i).getText());
				  getpaymentoptions().get(i).click(); 
			      break; 
			  } 
			}
		}
			 else {
				  System.out.println("unable to click on " + option); 
				  }
			
		}

}
