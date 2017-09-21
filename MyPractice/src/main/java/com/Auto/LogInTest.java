package com.Auto;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ASUS on 26/01/2017.
 */
public class LogInTest {


    FirefoxDriver driver;

    @Test
    public void VerifyPage(){

        String systemPath  = System.getProperty("user.dir");
        String driverPath = "\\driver\\firefox\\geckodriver-v0.13.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", systemPath+driverPath);
        driver = new FirefoxDriver();
        driver.get("https://www.google.co.uk/");
        String actual  = driver.getTitle( );
        String expected = "Google";

        Assert.assertEquals(actual, expected);


    }
}
