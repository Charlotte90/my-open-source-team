package com.asos.portal.steps;

import com.asos.portal.pages.HomePage;
import com.asos.portal.pages.NewLookPage;
import com.asos.portal.support.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Danny on 13/05/2017.
 */
public class SearchItemSteps {

    private WorldHelper helper;
    private NewLookPage newLookPage;
    private HomePage homePage;


    public SearchItemSteps(WorldHelper helper){
        this.helper = helper;
    }

    @Given("^I am on the home page of asos application$")
    public void i_am_on_the_home_page_of_asos_application() throws Throwable {
      homePage = helper.getBasePage().goToHomePage();
    }

    @When("^I search for item such as black belt$")
    public void i_search_for_item_such_as_black_belt() throws Throwable {
        newLookPage = homePage.mouseHoverMen().selectItem();
    }


    @Then("^I should see four sytles of black belts \"([^\"]*)\"$")
    public void i_should_see_four_sytles_of_black_belts(String blackBeltStyle) throws Throwable {
        boolean result = newLookPage.validateNumberOfBlackBelts(blackBeltStyle);
        Assert.assertTrue("Four Black Belts", result);
    }



}
