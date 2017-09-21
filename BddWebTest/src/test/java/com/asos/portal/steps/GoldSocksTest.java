package com.asos.portal.steps;

import com.asos.portal.pages.HomePage;
import com.asos.portal.support.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by ASUS on 16/05/2017.
 */
public class GoldSocksTest {
    private WorldHelper helper;
    private HomePage homePage;
    public  GoldSocksTest(WorldHelper helper){
        this.helper = helper;
    }

        @Given("^I Am on the asos HomePage$")
        public void i_Am_on_the_asos_HomePage() throws Throwable {
            homePage = helper.getBasePage().goToHomePage();

        }

        @When("^I search for the Gold socks$")
        public void i_search_for_the_Gold_socks() throws Throwable {
            homePage.SearchBox().selectGoldsocks();
        }

        @Then("^I should see types and styles of Gold socks$")
        public void i_should_see_types_and_styles_of_Gold_socks() throws Throwable {
              boolean results=  homePage.validateGoldSocks();
                Assert.assertTrue("Please, Try again", results);
        }



    }

