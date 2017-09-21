package com.asos.portal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dotcom on 14/03/17.
 */
public class AccountPage extends BasePage{

    @FindBy(id = "EmailAddress")
    private WebElement usernameField = null;
    @FindBy(id = "Password")
    private WebElement passwordField = null;
    @FindBy(id = "signin")
    private WebElement signInField = null;


    public AccountPage(WebDriver driver) {
        super(driver);
    }


    public WelcomePage loginWith(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        signInField.click();
        return PageFactory.initElements(driver, WelcomePage.class);
    }
}
