package com.asos.portal.asoshooks;

import com.asos.portal.Infrastructure.BrowserConfig.BrowserFactory;
import com.asos.portal.Infrastructure.filereader.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by dotcom on 21/03/17.
 */
public class ScenarioHooks {


    private BrowserFactory browserFactory;

    @Before
    public void testSetUp() throws Throwable {
        String browser = ConfigReader.getObjectRepoValue("asos.dev.default.browser");
        String executionArea = ConfigReader.getObjectRepoValue("asos.dev.exec.env.location");
        String machineType = ConfigReader.getObjectRepoValue("asos.dev.machine.type");
        String remotePlace = ConfigReader.getObjectRepoValue("asos.dev.remote.place");
        this.browserFactory = new BrowserFactory();
        browserFactory.setUpBrowser(browser, executionArea, machineType, remotePlace);
    }

    @After
    public void testCleanUp(){
        browserFactory.tearDownBrowser();
    }
}
