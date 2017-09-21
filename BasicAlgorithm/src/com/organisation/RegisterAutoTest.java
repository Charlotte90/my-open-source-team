package com.organisation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by retro20 on 1/18/17.
 */
public class RegisterAutoTest {
    private WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/retro20/MyProject/GitLab/JavaRp/java-16b-practice-repo/BasicAlgorithm/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.demo.guru99.com/V4/");

    }
    @After
    public void cleanUp(){
        driver.quit();
    }

    @Test
    public void validateHomePage(){
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.equals("Guru99 Bank Home Page"));

    }


}
