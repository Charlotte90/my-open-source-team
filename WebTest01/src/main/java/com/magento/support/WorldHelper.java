package com.magento.support;

import com.magento.browserLib.BrowserFactory;
import com.magento.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dotcom on 4/27/17.
 */
public class WorldHelper {

    private BasePage basePage = null;

    public BasePage getBasePage(){
        WebDriver driver = new BrowserFactory().getDriver();
        if(basePage != null) return basePage;
        return PageFactory.initElements(driver, BasePage.class);
    }


}
