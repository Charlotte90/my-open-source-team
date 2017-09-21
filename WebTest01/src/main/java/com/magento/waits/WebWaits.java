package com.magento.waits;

import com.magento.browserLib.BrowserFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * Created by dotcom on 5/25/17.
 */
public class WebWaits {

    public static boolean checkPageReady(int numOfTimes) {
        BrowserFactory browser = new BrowserFactory();
        WebDriver driver = browser.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Initially bellow given if condition will check ready state of page.
        if (js.executeScript("return document.readyState").toString().equals("complete")) {
            System.out.println("Page Is loaded.");
            return true;
        }

        //This loop will rotate for 25 times to check If page Is ready after every 1 second.
        //You can replace your value with 25 If you wants to Increase or decrease wait time.
        for (int i = 0; i < numOfTimes; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
            }
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")) {
                return true;
            }
        }
        return false;
    }
}
