package com.wooliesx.qa_code.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class CartPage extends BaseDriver {

	public CartPage(WebDriver driver) {
		super(driver);
    }
	
	protected By cartmessage = By.cssSelector(".layer_cart_product h2");
	protected By btnoptions = By.cssSelector(".button-container .btn-default");
	protected By carttable = By.cssSelector("#cart_summary tbody tr");
	protected By shippingTotal = By.cssSelector("#total_shipping");
	protected By totalPrice = By.id("total_price");
	protected By cartheader = By.id("cart_title");
	protected By proceedOptn = By.cssSelector(".cart_navigation .btn-default");
	protected By cartPopUp = By.cssSelector("#layer_cart .layer_cart_cart");
	protected By cartTotal = By.cssSelector(".ajax_block_cart_total");
	
	public void cartPopUpMssg()
	{
		if(driver!=null)
		{
			isElementPresent(cartmessage);
		}
	}
	
	public void cartHeaderIsDisplayed()
	{
		if(driver!=null)
		{
			isElementPresent(cartheader);
		}
	}

	public List<WebElement> getAllbtnoptions() {
		List<WebElement> getList=null;
		if(driver!=null) {
		WebElement cartpopup = driver.findElement(cartPopUp);
		 getList = cartpopup.findElements(btnoptions);
		 return getList;
		}
		return getList;
	}
	
	public void selectShoppingOption(String option) throws Exception
	{
		if(getAllbtnoptions()!=null)
		{
			 System.out.println(getAllbtnoptions().size());
			 Thread.sleep(1000);
			waitForElementPresent(cartPopUp,40);
			if(isElementPresent(btnoptions)) {
			 for(int i=0;i<getAllbtnoptions().size();i++) {
			  System.out.println(getAllbtnoptions().get(i).getText());
			  if(getAllbtnoptions().get(i).getText().equalsIgnoreCase(option)) {
			  
			  getAllbtnoptions().get(i).click(); 
			  break; 
			  } 
			}
		}
			 else {
				  System.out.println("unable to click on " + option); 
				  }
		}  
	}
	
	public List<WebElement> getCartTable(){
		return getList(carttable);
	}
	
	public String getItemTotal()
	{
		String price=null;
		
		if(getCartTable()!=null)
		{
			System.out.println(getCartTable().size());
			for(int i=1;i<getCartTable().size();i++)
			{
				if(getCartTable().get(1) != null)
				{
					price = driver.findElement(By.cssSelector("td.cart_total")).getText();
					break;
				}
				else if(getCartTable().get(2) != null)
				{
					price = driver.findElement(By.cssSelector("td.cart_total")).getText();
					break;
				}
				
				System.out.println(price);
			}
			
		}
		return price;
	}
	
	public String getShippingTotal()
	{
		String totalshipping = null;
		if(driver!=null) {
			totalshipping = getText(shippingTotal);
		}
		return totalshipping;
	}
	
	public void AssertCartTotal()
	{
		
		
		String totalcartPrice = getText(totalPrice);
		System.out.println(totalcartPrice);
		
		
		
	}
	public String getcartTotal()
	{ 
		String carttotl = null;
		if(isElementPresent(cartTotal)) {
			carttotl = getText(cartTotal);
			System.out.println(carttotl);
		}
		else
		{
		System.out.println("element not found");
		}
		return carttotl;
		
	}
	
	public List<WebElement> getAllproceedbtnoptions() {
		 return getList(proceedOptn);
		
	}

	public void selectProceedOption(String option) throws Exception
	{
		if(getAllproceedbtnoptions()!=null)
		{
			
			 System.out.println(getAllproceedbtnoptions().size());
			 Thread.sleep(1000);
			 for(int i=0;i<getAllproceedbtnoptions().size();i++) {
			  
			  
			  if(getAllproceedbtnoptions().get(i).getText().contains(option)) {
				  System.out.println(getAllproceedbtnoptions().get(i).getText());
				  getAllproceedbtnoptions().get(i).click(); 
			      break; 
			  } 
			}
		}
			 else {
				  System.out.println("unable to click on " + option); 
				  }
			
		}
	}

