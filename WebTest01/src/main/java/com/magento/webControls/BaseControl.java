package com.magento.webControls;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

/**
 * Created by dotcom on 5/11/17.
 */
public class BaseControl {

    private static Logger logger = LogManager.getLogger("TestLogger");

    public static boolean isElementEnabled(WebElement element) {
        logger.info("The element enabled status is "+element.isEnabled());
        return element.isEnabled();
    }

    public static boolean isElementDisplayed(WebElement element) {
        logger.info("The element displayed status is "+element.isDisplayed());
        return element.isDisplayed();
    }


    public static boolean isElementSelected(WebElement element) {
        boolean status = element.isSelected();
        logger.info("The element selected status is "+status);
        return status;
    }





}
