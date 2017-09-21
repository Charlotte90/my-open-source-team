package com.magento.pages;

import com.magento.webControls.ButtonControl;
import com.magento.webControls.TagControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dotcom on 4/29/17.
 */
public class HomePage extends BasePage{


//    @FindBy(id="top")
//    private WebElement TopOfThePage = null;

    @FindBy(className = "footer")
    private WebElement footer = null;

    public HomePage(WebDriver expectedDriver) {
        super(expectedDriver);
    }


    public AccountPage goToAccountPage() {
        TagControl.clickOnAnchorTag(footer, "My Account");
        return PageFactory.initElements(driver, AccountPage.class);
    }
}
