package com.laurajeeves.Hooks;

import com.laurajeeves.infrastructure.browserconfig.BrowserFactory;
import com.laurajeeves.infrastructure.filereader.ConfigReader;
import com.laurajeeves.infrastructure.screenreader.ScreenShots;
import com.laurajeeves.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Created by ASUS on 20/04/2017.
 */
public class HookTest {
    private WebDriver driver;
    private BrowserFactory browserFactory;
    protected BasePage basePage;

    @BeforeClass
    public static void beforeAllTest(){

        System.out.println("");
    }

    @AfterClass
    public static void afterAllTest()
    {
        System.out.println("");
    }

    @BeforeMethod
    public void testGenesis() {
        String browserName  = ConfigReader.getValue("laura-jeeves.browser");
        browserFactory = new BrowserFactory();
        this.driver = BrowserFactory.initialiseAndGetBrowser(browserName);
        basePage = PageFactory.initElements(driver, BasePage.class);
        basePage.loadApplicationHomePage();
    }

    @AfterMethod
    public void stopTest(ITestResult testResult){
        if (testResult.getStatus() == ITestResult.FAILURE) {
            ScreenShots screenShots = new ScreenShots(driver);
            screenShots.takeShot(testResult.getMethod().getMethodName());
        }else if(testResult.getStatus() == ITestResult.SUCCESS){
            System.out.println("Test Passed");
        }
        browserFactory.closeBrowser();
    }

}


