package com.organisation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by retro20 on 1/17/17.
 */
public class CardRunner {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "/home/retro20/MyProject/GitLab/JavaRp/java-16b-practice-repo/BasicAlgorithm/chromedriver");
        //cmd would launch browser
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //will max the browser window
        driver.manage().window().maximize();
        //Enter Url
        driver.navigate().to("http://www.demo.guru99.com/V4/");
        // Get page title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //Quits the driver
        driver.quit();


    }
}
