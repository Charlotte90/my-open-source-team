package com.laurajeeves.infrastructure.browserconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
    private static WebDriver driver;


//    public void loadBrowser(String browserName) {
//        String systempath = System.getProperty("user.dir");
//        if(browserName.equalsIgnoreCase("chrome")) {
//            String browserpath = systempath + "\\drivers\\chromedriver.exe";
//            System.setProperty("webdriver.chrome.driver", browserpath);
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        } else if (browserName.equalsIgnoreCase("firefox")) {
//            String browserpath = systempath + "\\drivers\\geckodriver.exe";
//            System.setProperty("webdriver.gecko.driver", browserpath);
//            driver = new FirefoxDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        }
    public static WebDriver initialiseAndGetBrowser(String browserName) {
        String systemPath = System.getProperty("user.dir");
        if (browserName.equalsIgnoreCase("firefox")) {
            String firefoxPath = systemPath + "\\drivers\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", firefoxPath);
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            String chromePath = systemPath + "\\drivers\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
        }
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            driver.navigate().to("http://www.laura-jeeves.com/");
//            Assert.assertTrue(true,message);
//            return driver;

        return null;
    }


  public  void closeBrowser(){

      driver.close();
  }
}
