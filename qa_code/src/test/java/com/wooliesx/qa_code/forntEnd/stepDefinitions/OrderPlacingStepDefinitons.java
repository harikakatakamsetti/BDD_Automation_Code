package com.wooliesx.qa_code.forntEnd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.vimalselvam.cucumber.listener.Reporter;
import com.wooliesx.qa_code.Hook.DriverHook;
import com.wooliesx.qa_code.pageObjects.CartPage;
import com.wooliesx.qa_code.pageObjects.CheckOutPage;
import com.wooliesx.qa_code.pageObjects.HomePage;
import com.wooliesx.qa_code.pageObjects.OrderConfirmationPage;
import com.wooliesx.qa_code.pageObjects.PaymentPage;
import com.wooliesx.qa_code.pageObjects.ProductDetailsPage;
import com.wooliesx.qa_code.pageObjects.ProductListingPage;
import com.wooliesx.qa_code.pageObjects.ShippingPage;
import com.wooliesx.qa_code.pageObjects.SigninPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderPlacingStepDefinitons extends DriverHook{
	
	 HomePage homepage;
	 WebDriver driver;
	 ProductListingPage listingpage;
	 ProductDetailsPage detailpage;
	 public String firstProduct;
	 CartPage cartpage;
	 SigninPage signinpage;
	 ShippingPage shippingpage;
	 OrderConfirmationPage orderpage;
	 PaymentPage paymentpage;
	 CheckOutPage checkoutpage;
	 Scenario scenario;
	 
	 @Before
		public void setUp(Scenario scenario) {
		 this.scenario = scenario;
			driver = this.getDriver();
			driver = this.lanuchurl();
			if (scenario.getName()!=null) {
	            Reporter.assignAuthor("Harika");
	        }
			
			}
		
	 @After
		public void tearDown(Scenario scenario) {
			if (scenario.isFailed()) {
				   String message = scenario.getName().replaceAll(" ", "_");
				   try {
				   Reporter.addStepLog(message);
				   Reporter.addScenarioLog(message);
				   } catch (Exception e) {
					   e.printStackTrace();
				   } 
				   }
			driver.close();
			
		}
	
	 @Given("^user is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
		homepage = new HomePage(driver);
		
		}
	
	@And("^user enters product name \"([^\"]*)\" on search bar$")
	public void user_enters_product_name_on_search_bar(String productName) throws Throwable {
		System.out.println(homepage);
	    homepage.searchFor(productName);
	}

	@When("^user clicks on search icon$")
	public void user_clicks_on_search_icon() throws Throwable {
		homepage.clickOnSeacrchIcon();
	
	}

	@Then("^verify user is on product listing page$")
	public void verify_user_is_on_product_listing_page() throws Throwable {
	   listingpage = new ProductListingPage(driver);
	   
	}

	@When("^user selects the first product \"([^\"]*)\"$")
	public void user_selects_the_first_product(String product1) throws Throwable {
		firstProduct = product1;
	   listingpage.selectItem(product1);
	}

	@Then("^verify user is on product details page$")
	public void verify_user_is_on_product_details_page() throws Throwable {
		detailpage = new ProductDetailsPage(driver);
		detailpage.pageIsLoaded();
		
	}

	@When("^user clicks on add to cart button$")
	public void user_clicks_on_button() throws Throwable {
		
		detailpage.addToCart();
		
	}

	@Then("^verify cart pop up is displayed$")
	public void verify_cart_pop_up_is_displayed() throws Throwable {
	   cartpage = new CartPage(driver);
	   cartpage.cartPopUpMssg();
	}

	@And("^user selects \"([^\"]*)\"$")
	public void user_selects(String option) throws Throwable {
	    cartpage.selectShoppingOption(option);
	   
	   
	}

	@When("^user selects the second product \"([^\"]*)\"$")
	public void user_selects_the_second_product(String product2) throws Throwable {

		listingpage.selectItem(product2);
	}

	
	@Then("^verify user is on cart page$")
	public void verify_user_is_on_cart_page() throws Throwable {
		cartpage.cartHeaderIsDisplayed();
	   
	}

	@Then("^verify products and total are displayed$")
	public void verify_products_and_total_are_displayed() throws Throwable {
	    cartpage.AssertCartTotal();
	}

	 @When("^user clicks on \"([^\"]*)\"$") 
	 public void user_clicks_on(String proceed) throws Throwable {
		 cartpage.selectProceedOption(proceed);
		 
	 }

	@Then("^verify user is on sign in page$")
	public void verify_user_is_on_page() throws Throwable {
		signinpage = new SigninPage(driver);
		signinpage.signHeader();
	    
	}

	@Then("^user login with registered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_registered_and(String userName, String psswd) throws Throwable {
	   signinpage.userLogin(userName, psswd);
	}

	

	@Then("^verify user is on billing address page$")
	public void verify_user_is_on_billing_address_page() throws Throwable {
		checkoutpage = new CheckOutPage(driver);
	}
	@And("^verify saved billing address,invoice address,email are displayed$")
	public void verify_saved_billing_address_invoice_address_email_are_displayed() throws Throwable {
		checkoutpage.validateEmailAddress();
		checkoutpage.validateDeliveryAddress();
		checkoutpage.validateInvoiceAddress();
	}

	@Then("^verify user is on shipping page$")
	public void verify_user_is_on_shipping_page() throws Throwable {
		shippingpage = new ShippingPage(driver);
	}

	@And("^user clicks on terms and conditions$")
	public void user_clicks_on_terms_and_conditions() throws Throwable {
		shippingpage.accpectTermsAndCond();
	}

	@Then("^verify user is on payment page$")
	public void verify_user_is_on_payment_page() throws Throwable {
		paymentpage = new PaymentPage(driver);
		paymentpage.validatePaymentHeader();
	}

	@And("^user selects the payment option \"([^\"]*)\"$")
	public void user_selects_the_payment_option(String paymentOption) throws Throwable {
		paymentpage.selectPaymentOption(paymentOption);
	}

	@Then("^verify user is able to see payment details$")
	public void verify_user_is_able_to_see_payment_details() throws Throwable {
		paymentpage.paymentInfoDisplay();
	}

	@Then("^verify user is on order confirmation page$")
	public void verify_user_is_on_order_confirmation_page() throws Throwable {
		orderpage = new OrderConfirmationPage(driver);
	}

	@And("^user is able to see successful order message$")
	public void user_is_able_to_see_successful_order_message() throws Throwable {
		orderpage.orderConfirmationMess();
	}

	@When("^user clicks on logut$")
	public void user_clicks_on_logut() throws Throwable {
		signinpage.logout();
	}

	@Then("^verify user is on signin page$")
	public void verify_user_is_on_signin_page() throws Throwable {
		signinpage.signHeader();
	}


	
	

}
