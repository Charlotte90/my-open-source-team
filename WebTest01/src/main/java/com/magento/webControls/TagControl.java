package com.magento.webControls;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by dotcom on 5/27/17.
 */
public class TagControl extends BaseControl {

    private static Logger logger = LogManager.getLogger("TestLogger");


    public static void clickOnAnchorTag(WebElement element, String textOfAnchor){
        for(WebElement myElement : element.findElements(By.tagName("a"))){
            if(!myElement.getText().toLowerCase().contains(textOfAnchor.toLowerCase()))continue;
            myElement.click();
            break;
        }
    }

    public static void clickOnSpanTag(WebElement element, By subLocator, String textOfAnchor){
        for(WebElement myElement : element.findElement(subLocator).findElements(By.tagName("span"))){
            if(!myElement.getText().toLowerCase().contains(textOfAnchor.toLowerCase()))continue;
            myElement.click();
            break;
        }
    }

    public static void clickOnLiTag(WebElement element, By subLocator, String textOfAnchor){
        for(WebElement myElement : element.findElement(subLocator).findElements(By.tagName("li"))){
            if(!myElement.getText().toLowerCase().contains(textOfAnchor.toLowerCase()))continue;
            myElement.click();
            break;
        }
    }
}
