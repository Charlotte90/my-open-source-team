package com.asos.portal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dotcom on 14/03/17.
 */
public class WelcomePage extends BasePage{

    @FindBy(id = "signedin")
    private WebElement SigninElement = null;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public boolean validateUserFirstName(String firstName) {
        return driver.getPageSource().toLowerCase().contains(firstName.toLowerCase());
    }

    public HomePage logoutOfAsos() {
        for (WebElement element : SigninElement.findElements(By.tagName("a")))  {
            if(!element.getText().toLowerCase().contains("sign out")) continue;
            element.click();
            break;
        }
        return PageFactory.initElements(driver, HomePage.class);
    }
}
