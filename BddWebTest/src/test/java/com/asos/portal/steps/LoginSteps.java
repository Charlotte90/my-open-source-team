package com.asos.portal.steps;

import com.asos.portal.pages.HomePage;
import com.asos.portal.pages.WelcomePage;
import com.asos.portal.support.WorldHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 * Created by dotcom on 09/03/17.
 */
public class LoginSteps {

    private WorldHelper helper;
    private HomePage homePage;
    private WelcomePage welcomePage;


       public LoginSteps(WorldHelper helper) {
        this.helper = helper;
    }


    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() throws Throwable {
        homePage = helper.getBasePage().goToHomePage();
    }



    @When("^on successful logon$")
    public void onSuccessfulLogon(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        String username =  data.get(1).get(0);
        String password = data.get(1).get(1);

        welcomePage = homePage
                .goToAccountPage()
                .loginWith(username, password);
    }

    @Then("^I should see my account details$")
    public void iShouldSeeMyAccountDetails(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        String firstname =  data.get(1).get(0);
        Assert.assertTrue(welcomePage.validateUserFirstName(firstname));
    }



    @Given("^I want to login to asos app$")
    public void iWantToLoginToAsosApp() throws Throwable {
        homePage = helper.getBasePage().goToHomePage();
    }

    @When("^I login with \"([^\"]*)\" & \"([^\"]*)\"$")
    public void iLoginWith(String username, String password) throws Throwable {
        welcomePage = homePage
                .goToAccountPage()
                .loginWith(username, password);
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String firstname) throws Throwable {
        Assert.assertTrue(welcomePage.validateUserFirstName(firstname));
    }



    //This is for Data driven test
    @Given("^I want to login to asos application$")
    public void iWantToLoginToAsosApplication() throws Throwable {
        homePage = helper.getBasePage().goToHomePage();
    }

    @When("^I login with a \"([^\"]*)\" & a \"([^\"]*)\"$")
    public void iLoginWithAA(String username, String password) throws Throwable {
        welcomePage = homePage
                .goToAccountPage()
                .loginWith(username, password);
    }

    @Then("^I should check \"([^\"]*)\"$")
    public void iShouldCheck(String firstname) throws Throwable {
        Assert.assertTrue(welcomePage.validateUserFirstName(firstname));
    }

}
