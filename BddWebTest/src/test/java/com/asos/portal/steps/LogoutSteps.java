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
 * Created by dotcom on 21/03/17.
 */
public class LogoutSteps  {


    private HomePage homePage;
    private WelcomePage welcomePage;
    private WorldHelper worldHelper;

    public LogoutSteps(WorldHelper worldHelper) {
        this.worldHelper = worldHelper;
    }

    @Given("^I am logged in to the application$")
    public void iAmLoggedInToTheApplication(DataTable table) throws Throwable {
        List<List<String>> credentials = table.raw();
        String username = credentials.get(1).get(0);
        String password = credentials.get(1).get(1);

        welcomePage = worldHelper
                .getBasePage()
                .goToHomePage()
                .goToAccountPage()
                .loginWith(username, password);
    }


    @When("^I logout after shopping$")
    public void iLogoutAfterShopping() throws Throwable {
        homePage = welcomePage.logoutOfAsos();
    }

    @Then("^I should see my account is secure$")
    public void iShouldSeeMyAccountIsSecure(DataTable table) throws Throwable {
        List<List<String>> credentials = table.raw();
        String message = credentials.get(1).get(0);

        boolean result = homePage.validatelogout(message);
        Assert.assertTrue("Does not contain "+message, result);
    }
}
