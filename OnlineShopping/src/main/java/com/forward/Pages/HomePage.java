package com.forward.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by KELVIN on 26/03/2017.
 */
public class HomePage extends BasePage {

    @FindBy(linkText = "My Account")
    WebElement SignInPageLink =null;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public SignInPage gotoMyAccount() {
        SignInPageLink.click();
    return PageFactory.initElements(driver, SignInPage.class);
    }










}
