package artOfTesting.test;

import browserFactory.Browsers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.GoogleHomePage;
import pages.SearchResultPage;

public class googleCalcStepDefinition {
	
	

	private Browsers browsers;
	private GoogleHomePage homePage;
	private SearchResultPage searchResultPage;

	@Before
	public void setup() {
		this.browsers = new Browsers();
		browsers.initiliaseBrowser();
	}
		
	@Given("^I open google$")
	public void I_open_google() {
		//Set implicit wait of 10 seconds and launch google
		BasePage basePage = new BasePage(Browsers.getDriver());
		homePage = basePage.visitGoogleHomePage();
	}
	
	@When("^I enter \"([^\"]*)\" in search textbox$")
	public void I_enter_in_search_textbox(String additionTerms) throws InterruptedException {
		//Write term in google textbox
		searchResultPage = homePage.enterAndSearchFor(additionTerms);
	}
	
	@Then("^I should get result as \"([^\"]*)\"$")
	public void I_should_get_correct_result(String expectedResult) {
		//Get result from calculator
		String result = searchResultPage.getResult();
				
		//Verify that result of 2+2 is 4
		Assert.assertEquals(result, expectedResult);
	}
	
	 @After
	    public void closeBrowser() {
	        browsers.closeBrowser();
	 }

}


