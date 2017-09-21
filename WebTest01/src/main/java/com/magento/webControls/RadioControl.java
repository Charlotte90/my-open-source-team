package com.magento.webControls;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import static com.magento.webControls.BaseControl.isElementEnabled;

/**
 * Created by dotcom on 5/11/17.
 */
public class RadioControl extends BaseControl{


    private static Logger logger = LogManager.getLogger("TestLogger");

    public static void clickButton(WebElement element){
        for(int counter = 0; counter <= 5; counter++){
            if(isElementEnabled(element)) {
                element.click();
                logger.info("Element is clicked");
                return;
            }else{
                try {
                    Thread.sleep(500);
                    logger.warn("Waited for "+0.5+ " seconds");
                } catch (InterruptedException e) {
                    logger.error(e.getMessage());
                }
            }

        }
    }




}
