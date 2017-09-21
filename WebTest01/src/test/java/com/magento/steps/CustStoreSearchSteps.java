package com.magento.steps;

import com.magento.pages.SearchResultPage;
import com.magento.pages.WelcomePage;
import com.magento.support.WorldHelper;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 * Created by dotcom on 5/27/17.
 */
public class CustStoreSearchSteps {

    private final WorldHelper helper;
    private WelcomePage welcomePage;
    private SearchResultPage searchResultPage;

    public CustStoreSearchSteps(WorldHelper helper) {
        this.helper = helper;
    }


    @Given("^I have logged on to the application$")
    public void iHaveLoggedOnToTheApplication(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        String username = data.get(1).get(0);
        String password = data.get(1).get(1);

        welcomePage = helper
                .getBasePage()
                .goToHomePage()
                .goToAccountPage()
                .loginWith(username, password);
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String itemName) throws Throwable {
        searchResultPage = welcomePage.searchFor(itemName);
    }

    @Then("^the price would be \"([^\"]*)\"$")
    public void thePriceWouldBe(String price) throws Throwable {
        Assert.assertFalse(!searchResultPage.validateIphonePrice(price));
    }

    @Then("^the price of TV would be \"([^\"]*)\"$")
    public void thePriceOfTVWouldBe(String tvPrice) throws Throwable {
        Assert.assertFalse(!searchResultPage.validateLgTvPrice(tvPrice));
    }
}
