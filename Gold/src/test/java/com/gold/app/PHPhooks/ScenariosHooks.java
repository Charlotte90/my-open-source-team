package com.gold.app.PHPhooks;

import com.gold.app.browserLib.BrowserFactory;
import com.gold.app.configManager.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;


/**
 * Created by Danny on 29/04/2017.
 */
public class ScenariosHooks {

    private BrowserFactory browserFactory;


    @Before
    public void testSetUp() throws Throwable {
        String browserName = ConfigReader.getValue("php.dev.default.browser");
        String executionArea = ConfigReader.getValue("php.dev.exec.env.location");
        String machineType = ConfigReader.getValue("php.dev.machine.type");

        this.browserFactory = new BrowserFactory();
        browserFactory.setUpBrowser(browserName, executionArea, machineType);
    }

    @After
    public void testCleanUp() {
        browserFactory.tearDownBrowser();
    }
}
