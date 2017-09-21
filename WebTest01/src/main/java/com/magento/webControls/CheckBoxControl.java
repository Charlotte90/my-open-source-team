package com.magento.webControls;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import static com.magento.webControls.BaseControl.isElementDisplayed;
import static com.magento.webControls.BaseControl.isElementEnabled;
import static com.magento.webControls.BaseControl.isElementSelected;

/**
 * Created by dotcom on 5/11/17.
 */
public class CheckBoxControl extends BaseControl{

    private static Logger logger = LogManager.getLogger("TestLogger");


    public static void tickCheckBox(WebElement element){
        for(int count = 0; count <= 5; count++){
            if(!isElementDisplayed(element) && !isElementEnabled(element)) continue;
            if(!isElementSelected(element)) {
                element.click();
                logger.info("Element is clicked");
                return;
            }
            logger.warn("Unable to click on the element");
            return;
        }
    }


    public static void unTickCheckBox(WebElement element){
        for(int count = 0; count <= 5; count++){
            if(!isElementDisplayed(element) && !isElementEnabled(element)) continue;
            if(isElementSelected(element)) {
                element.click();
                logger.info("Element is clicked");
                return;
            }
            logger.warn("Unable to click on the element");
            return;
        }
    }

    public static String getCheckBoxText(WebElement element){
        for(int count = 0; count <= 5; count++){
            if(!isElementDisplayed(element) && !isElementEnabled(element)) continue;
            String text = element.getText();
            logger.info("Element text is "+text);
            return text;
        }
        logger.warn("Unable to get text on the element");
        return "";
    }




}
