package junitTests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/apifeature/getweather.feature"}
		,monochrome=true
		,glue = {"com.wooliesx.qa_code.api.stepDefinitions"},
	    tags = {"@weather"},
	    plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:src/test/Reporting/extent-reports/report.html","pretty", "html:src/test/Reporting/cucumber-reports"}
		
		)
public class ApiTest {
	
	@AfterClass
	public static void teardown() {
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	Reporter.setSystemInfo("user", System.getProperty("user.name"));
	Reporter.setTestRunnerOutput("WoolieX Test Reports");
	}
}
