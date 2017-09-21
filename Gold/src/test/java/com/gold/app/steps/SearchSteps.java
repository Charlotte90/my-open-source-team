package com.gold.app.steps;

import com.gold.app.pages.HomePage;
import com.gold.app.support.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Danny on 29/04/2017.
 */
public class SearchSteps {


    private WorldHelper helper;
    private HomePage homePage;




    public SearchSteps(WorldHelper helper) {
         this.helper = helper;
    }

    @Given("^: I am on the home page of hotels$")
    public void iAmOnTheHomePageOfHotels() throws Throwable {

     homePage = helper.getBasePage().goToHomePage();
    }

    @When("^: I enter a destination details$")
    public void iEnterADestinationDetails() throws Throwable {
       homePage.goToHotelSearch().ListPriceOfHotel();

    }

    @Then("^: I list of prices of hotels$")
    public void iListOfPricesOfHotels() throws Throwable {
        boolean result = homePage.ListPriceOfHotel();
        Assert.assertTrue(result);
    }

}
