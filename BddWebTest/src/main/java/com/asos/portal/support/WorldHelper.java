package com.asos.portal.support;

import com.asos.portal.Infrastructure.BrowserConfig.BrowserFactory;
import com.asos.portal.pages.BasePage;
import com.asos.portal.pages.HomePage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dotcom on 21/03/17.
 */
public class WorldHelper  {

    private BasePage basePage;
    private HomePage homePage;


    public BasePage getBasePage(){
        if(basePage != null) return basePage;
        BrowserFactory browserFactory = new BrowserFactory();
        return PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
    }


    public HomePage getHomePage(){
        if(basePage != null) return homePage;
        BrowserFactory browserFactory = new BrowserFactory();
        return PageFactory.initElements(browserFactory.getDriver(), HomePage.class);
    }





}
