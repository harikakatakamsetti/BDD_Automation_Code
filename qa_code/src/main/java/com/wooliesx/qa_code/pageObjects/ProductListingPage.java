package com.wooliesx.qa_code.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListingPage extends BaseDriver {

	public ProductListingPage(WebDriver driver) {
		super(driver);
		}
	
	By productName = By.cssSelector(".product-container .right-block .product-name");
	

	public List<WebElement> getAllProducts() {
		 return getList(productName);
		
	}
	
	public void selectItem(String product)
	{
		if(getAllProducts()!=null)
		{
			for(WebElement item:getAllProducts())
			{
				if(item.getText().equalsIgnoreCase(product))
				{
					System.out.println(item);
					item.click();
					break;
				}
				
			}
		}
	}

}
