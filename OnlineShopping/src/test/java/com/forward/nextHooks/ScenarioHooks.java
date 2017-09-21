package com.forward.nextHooks;


import com.forward.browserConfig.BrowserFactory;
import com.forward.fileReader.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by KELVIN on 25/03/2017.
 */
public class ScenarioHooks {


    private BrowserFactory browserFactory;


    @Before
    public void setupTest() throws Exception {
        String browserName  = ConfigReader.getValue("browser_Type");
        browserFactory = new BrowserFactory();
        browserFactory.initialiseBroswer(browserName);
    }

    @After
    public void closeTest() {
        browserFactory.tearDown();
    }



}
