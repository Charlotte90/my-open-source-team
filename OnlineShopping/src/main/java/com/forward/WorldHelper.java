package com.forward;



import com.forward.Pages.BasePage;
import com.forward.browserConfig.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by KELVIN on 25/03/2017.
 */
public class WorldHelper extends BrowserFactory {

    private BasePage basePage;

    public BasePage getBasePage() {
        if(basePage != null) return basePage;
        return PageFactory.initElements(driver, BasePage.class);
    }




}
