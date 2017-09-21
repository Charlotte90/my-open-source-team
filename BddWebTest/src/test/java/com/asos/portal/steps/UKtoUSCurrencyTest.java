package com.asos.portal.steps;

import com.asos.portal.pages.HomePage;
import com.asos.portal.support.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by ASUS on 13/05/2017.
 */
public class UKtoUSCurrencyTest {

    private WorldHelper helper;
    private HomePage homePage;

    public UKtoUSCurrencyTest(WorldHelper helper) {
        this.helper = helper;
    }
    @Given("^I Am on The HomePage$")
    public void i_Am_on_The_HomePage() throws Throwable {
         homePage = helper.getBasePage().goToHomePage();
}
    @When("^I Change UK currency to US Currency$")
    public void i_Change_UK_currency_to_US_Currency() throws Throwable {
        homePage.changeCurrencyOrCountry();
    }
    @Then("^I should see United State Flag$")
    public void i_should_see_United_State_Flag() throws Throwable {
                    boolean result = homePage.uSValidation();
                Assert.assertTrue(result);
    }
}
