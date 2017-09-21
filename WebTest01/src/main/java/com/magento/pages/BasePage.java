package com.magento.pages;

import com.magento.configManager.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dotcom on 4/27/17.
 */
public class BasePage {

    protected final WebDriver driver;

    public BasePage(WebDriver expectedDriver) {
        this.driver = expectedDriver;
    }


    public HomePage goToHomePage() {
        driver.navigate().to(ConfigReader.getGlobalValue("base.url"));
        return PageFactory.initElements(driver, HomePage.class);
    }


}
