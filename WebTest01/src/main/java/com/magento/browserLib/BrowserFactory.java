package com.magento.browserLib;



import com.magento.configManager.ConfigReader;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by dotcom on 28/01/17.
 */
public class BrowserFactory {


    protected static WebDriver driver;

    public WebDriver setUpBrowser(String browserName, String remoteOrLocalTest, String machineType) throws Throwable {
        if(remoteOrLocalTest.equalsIgnoreCase("local")){
            setUpBrowserOnLocalMachine(browserName, machineType);
        }else if(remoteOrLocalTest.equalsIgnoreCase("remote")){
            setUpBrowserOnRemoteMachine(browserName);
        }else{
            throw new IllegalAccessException("There is no such environment to run the test");
        }
        this.applyGlobalWaitAndClearCookies();
        return driver;
    }

    private void applyGlobalWaitAndClearCookies() {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        long defaultTime = Long.parseLong(ConfigReader.getGlobalValue("default.time"));
        driver.manage().timeouts().implicitlyWait(defaultTime, TimeUnit.SECONDS);
    }

    private void setUpBrowserOnRemoteMachine(String browserName) throws MalformedURLException {
        String remotePlace = ConfigReader.getGlobalValue("remote.name");
        RemoteCustomCapabilities remoteCaps = new RemoteCustomCapabilities(remotePlace);
        if(browserName.trim().equalsIgnoreCase("firefox")){
            driver = remoteCaps.getFirefoxDriver();
        }else if(browserName.trim().equalsIgnoreCase("internet explorer")){
            driver = remoteCaps.getIEDriver();
        }else if(browserName.trim().equalsIgnoreCase("microsoft edge")){
            driver = remoteCaps.getMicrosoftEdgeDriver();
        }else if(browserName.trim().equalsIgnoreCase("chrome")){
            driver = remoteCaps.getChromeDriver();
        }else{
            System.out.println("");
        }
    }

    private void setUpBrowserOnLocalMachine(String browserName, String machineType) throws IllegalAccessException {
        LocalCustomCapabilities localcaps = new LocalCustomCapabilities();
        if(browserName.equalsIgnoreCase("firefox")){
            driver = localcaps.getFirefoxDriver(machineType);
        }else if(browserName.equalsIgnoreCase("internet explorer")){
            driver = localcaps.getIEDriver(machineType);
        }else if(browserName.equalsIgnoreCase("microsoft edge")){
            driver = localcaps.getMicrosoftEdgeDriver(machineType);
        }else if(browserName.equalsIgnoreCase("chrome")){
            driver = localcaps.getChromeDriver(machineType);
        }else if(browserName.equalsIgnoreCase("phantomjs")){
            driver = localcaps.getPhantonJsDriver(machineType);
        }else if(browserName.equalsIgnoreCase("htmlUnit")){
            driver = localcaps.getHtmlChromeUnitDriver(machineType);
        }else if(browserName.equalsIgnoreCase("safari")){
            driver = localcaps.getSafariDriver();
        }
    }






    public void tearDownBrowser(){
        if(driver != null)
            driver.close();
    }


    public WebDriver getDriver(){
        return driver;
    }
}
