package com.forward.nextHooks.steps;


import com.forward.Pages.HomePage;
import com.forward.Pages.MyAccountPage;
import com.forward.Pages.WelcomePage;
import com.forward.WorldHelper;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by KELVIN on 27/03/2017.
 */
public class SignInSteps {

    private WorldHelper worldHelper;
    private HomePage homepage;
    private WelcomePage welcomePage;
    private MyAccountPage myAccountPage;


    public SignInSteps(WorldHelper worldHelper) {
        this.worldHelper = worldHelper;
    }


    @Given("^I am on the SignIn Page$")
    public void iAmOnTheSignInPage() throws Throwable {
            homepage = worldHelper.getBasePage().goToHomePage();

    }

    @When("^I choose to sign in with my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iChooseToSignInWithMyAnd(String username, String password) throws Throwable {
        myAccountPage = homepage.gotoMyAccount().signInWith(username, password);

    }

    @Then("^I am signed in to the application$")
    public void iAmSignedInToTheApplication() throws Throwable {

       System.out.println("Will have to implement the ASSERTION");

        throw new PendingException();
    }


}
