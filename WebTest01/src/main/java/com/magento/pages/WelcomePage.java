package com.magento.pages;

import com.magento.webControls.ButtonControl;
import com.magento.webControls.TextFieldsControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dotcom on 4/29/17.
 */
public class WelcomePage extends BasePage {

    @FindBy(id = "search")
    private WebElement searchStore = null;
    @FindBy(className = "search-button")
    private WebElement searchButton = null;

    public WelcomePage(WebDriver expectedDriver) {
        super(expectedDriver);
    }


    public boolean validateAccountNamePresent(String accountName) {
        return driver.getPageSource().toUpperCase().contains(accountName.toUpperCase());
    }

    public SearchResultPage searchFor(String itemName) {
        TextFieldsControl.enterText(searchStore, itemName);
        ButtonControl.clickButton(searchButton);
        return PageFactory.initElements(driver, SearchResultPage.class);
    }
}
