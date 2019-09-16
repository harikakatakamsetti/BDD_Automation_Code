package com.wooliesx.qa_code.api.stepDefinitions;

import com.vimalselvam.cucumber.listener.Reporter;
import com.wooliesx.qa_code.restAssuredUtilities.ApiRestAssured;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class weatherStepDefintions extends ApiRestAssured{
	Scenario scenario;
	
	@Before
	public void setUp(Scenario scenario) {
		this.scenario = scenario;
		if (scenario.getName()!=null) {
            Reporter.assignAuthor("Harika");
        }
		
		}
	
	
	@Given("^user is able to access weather api$")
	public void user_is_able_to_access_weather_api() throws Throwable {
		
		Reporter.addScenarioLog(scenario.getName().replace(" ", "_"));
	}

	@When("^user send request for \"([^\"]*)\"$")
	public void user_send_request_for(String city) throws Throwable {
		performGetRequest(city);
	    
	}

	@Then("^I receive the weather forecast as \"([^\"]*)\"$")
	public void i_receive_the_weather_forecast_as(String status) throws Throwable {
		getStatusCode(status);
	}

	@And("^user should see the response contains \"([^\"]*)\"$")
	public void user_should_see_the_response_contains(String city) throws Throwable {
		String responsecity =getValueResponse("name");
		Assert.assertTrue(responsecity.equalsIgnoreCase(city));
	}

}
