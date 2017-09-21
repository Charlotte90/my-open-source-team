package com.magento.steps;

import com.magento.pages.AccountPage;
import com.magento.pages.WelcomePage;
import com.magento.support.WorldHelper;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by dotcom on 4/29/17.
 */
public class CustomerLoginSteps {

    private final WorldHelper helper;
    private AccountPage accountPage;
    private WelcomePage welcomePage;

    public CustomerLoginSteps(WorldHelper helper) {
        this.helper = helper;
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() throws Throwable {
        accountPage = helper
                .getBasePage()
                .goToHomePage()
                .goToAccountPage();
    }

    @When("^I login with \"([^\"]*)\" & \"([^\"]*)\"$")
    public void iLoginWith(String username, String password) throws Throwable {
        welcomePage = accountPage.loginWith(username, password);
    }

    @Then("^I should check \"([^\"]*)\"$")
    public void iShouldCheck(String accountName) throws Throwable {
        boolean response  = welcomePage.validateAccountNamePresent(accountName);
        Assert.assertFalse("Does not contain the account name as expected", !response);
    }


}
