package com.asos.portal.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


/**
 * Created by Edwin on 14/05/2017.
 */


public class CustomWait {


    public static void checkPageIsReady(WebDriver driver, int numOfTimes) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Initially bellow given if condition will check ready state of page.
        if (js.executeScript("return document.readyState").toString().equals("complete")) {
            System.out.println("Page Is loaded.");
            return;
        }

        //This loop will rotate for 25 times to check If page Is ready after every 1 second.
        //You can replace your value with 25 If you wants to Increase or decrease wait time.
        for (int i = 0; i < numOfTimes; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")) {
                break;
            }
        }
    }


}
