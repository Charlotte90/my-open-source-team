package com.gold.app.support;

import com.gold.app.browserLib.BrowserFactory;
import com.gold.app.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Danny on 29/04/2017.
 */
public class WorldHelper extends BrowserFactory{

    private BasePage basePage = null;



    public BasePage getBasePage(){
         if(basePage !=  null) return basePage;
     return PageFactory.initElements(driver, BasePage.class);
    }


}
