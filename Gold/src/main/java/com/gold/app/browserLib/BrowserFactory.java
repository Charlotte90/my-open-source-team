package com.gold.app.browserLib;

import com.gold.app.configManager.ConfigReader;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Danny on 29/04/2017.
 */
public class BrowserFactory {

    protected static WebDriver driver;

    public WebDriver setUpBrowser(String browserName,String executionArea, String machineType) throws Throwable {

   if(executionArea.equalsIgnoreCase("local")){
       setUpBrowserOnLocalMachine(browserName,machineType);
  }else if(executionArea.equalsIgnoreCase("remote")){
       setUpBrowserOnRemoteMachine(browserName);
   } else {
       throw new IllegalAccessException("No such environment");
   }

   this.prepareBrowser();
        return driver;
    }

    private void setUpBrowserOnRemoteMachine(String browserName) throws MalformedURLException {
        RemoteCustomCapabilities remoteCaps = new RemoteCustomCapabilities();
              if(browserName.equalsIgnoreCase("firefox")){
                  driver = remoteCaps.getFireFoxDriver();
              }else if(browserName.equalsIgnoreCase("chrome")){
                 driver= remoteCaps.getChromeDriver();
              }else if(browserName.equalsIgnoreCase("internet explorer")){
                  driver = remoteCaps.getIEDriver();
              }else if(browserName.equalsIgnoreCase("safari")){
                  driver = remoteCaps.getSafariDriver();
              }else if(browserName.equalsIgnoreCase("microsoft edge")){
                  driver = remoteCaps.getMicrosoftEdge();
              }



    }
    private void setUpBrowserOnLocalMachine(String browserName, String machineType) {
        LocalCustomCapabilities localCaps = new LocalCustomCapabilities();
        if(browserName.equalsIgnoreCase("firefox")){
            driver =  localCaps.getFireFoxDriver(machineType);
        }else if(browserName.equalsIgnoreCase("chrome")){
            driver =  localCaps.getChromeDriver(machineType);
        }else if(browserName.equalsIgnoreCase("internet explorer")){
                driver = localCaps.getIEDriver(machineType);
        }else if(browserName.equalsIgnoreCase("microsoft edge")){
                 driver = localCaps.getMicrosoftEdge(machineType);
        }else if(browserName.equalsIgnoreCase("safari")){
             driver =localCaps.getSafariDriver(machineType);
        }

    }
    private void prepareBrowser() throws IOException {
        driver.manage().window().maximize();
        Long  defaultTime = Long.parseLong(ConfigReader.getValue("php.dev.default.time"));
         driver.manage().timeouts().implicitlyWait(defaultTime, TimeUnit.SECONDS);


    }

    public void tearDownBrowser(){
        if(driver != null)
            driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
