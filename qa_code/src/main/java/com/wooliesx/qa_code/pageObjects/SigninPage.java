package com.wooliesx.qa_code.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage extends BaseDriver{
	
	protected By username = By.id("email");
	protected By password = By.id("passwd");
	protected By signbtn = By.id("SubmitLogin");
	protected By formHeader = By.cssSelector("#login_form h3");
	protected By logout = By.cssSelector(".logout");

	public SigninPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void userLogin(String userName,String psswrd)
	{
		if(driver!=null)
		{
			enterText(username,userName);
			enterText(password,psswrd);
			clickElement(signbtn);
		}
	}
	
	public void signHeader()
	{
		if(driver!=null)
		{
			isElementPresent(formHeader);
		}
	}
	
	 public void logout()
	 {
		 if(isElementPresent(logout))
		 {
			 clickElement(logout);
		 }
		 else
		 {
			 System.out.println("something went wrong while performing logout");
		 }
	 }

}
