package com.forward.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by KELVIN on 26/03/2017.
 */
public class SignInPage extends BasePage {

    @FindBy (id = "EmailOrAccountNumber")
    WebElement emailAddressField = null;

    @FindBy (id = "Password")
    WebElement passwordField = null;

    @FindBy (name = "SignInNow")
    WebElement signInButton = null;

    public SignInPage(WebDriver driver) {
        super(driver);
    }


    public MyAccountPage signInWith (String username, String password) {
        emailAddressField.sendKeys(username);
        passwordField.sendKeys(password);
        signInButton.click();
        return PageFactory.initElements(driver, MyAccountPage.class);
    }


}
