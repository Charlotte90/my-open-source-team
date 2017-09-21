package com.asos.portal.steps;

import com.asos.portal.pages.HomePage;
import com.asos.portal.pages.ProductDisplayPage;
import com.asos.portal.support.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by KELVIN on 13/05/2017.
 */
public class SearchAddToBag {

    private WorldHelper worldHelper;
    private ProductDisplayPage productDisplayPage;
    private HomePage homePage;


    public SearchAddToBag(WorldHelper worldHelper) {
        this.worldHelper = worldHelper;

    }

    @Given("^I search for a product using a \"([^\"]*)\"$")
    public void iSearchForAProductUsingA(String productNumber) throws Throwable {
        productDisplayPage = worldHelper
                .getBasePage()
                .goToHomePage()
                .productSearch(productNumber);
    }

    @When("^I choose to add the product to my shopping bag$")
    public void iChooseToAddTheProductToMyShoppingBag() throws Throwable {
        homePage = productDisplayPage.addProductToBag();
    }

    @Then("^the product is added to the shopping bag \"([^\"]*)\"$")
    public void theProductIsAddedToTheShoppingBag(String productPrice) throws Throwable {
        Assert.assertTrue(homePage.verifyProductAddedToBag(productPrice));
    }


}




