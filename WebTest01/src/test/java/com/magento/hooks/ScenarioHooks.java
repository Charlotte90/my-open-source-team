package com.magento.hooks;

import com.magento.browserLib.BrowserFactory;
import com.magento.configManager.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by dotcom on 4/29/17.
 */
public class ScenarioHooks {


    private BrowserFactory browserFactory = null;

    @Before(order = 2)
    public void setUpTestScenario() throws Throwable {
        browserFactory = new  BrowserFactory();
        String browserName  = ConfigReader.getGlobalValue("browser.type");
        String remoteOrLocal  = ConfigReader.getGlobalValue("remote.or.local");
        String machineType  = ConfigReader.getGlobalValue("machine.type");
        browserFactory.setUpBrowser(browserName,remoteOrLocal, machineType);
    }


    @After(order = 2)
    public void cleanUpTestScenario(){
        browserFactory.tearDownBrowser();
    }

    @Before(order = 3)
    public void setUpTestScenarioV2() throws Throwable {
        System.out.println("Configuring database system");
    }


    @After(order = 3)
    public void cleanUpTestScenarioV2(){
        System.out.println("closing database system");
    }
}
