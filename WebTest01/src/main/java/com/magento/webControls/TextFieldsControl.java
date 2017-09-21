package com.magento.webControls;

import com.magento.configManager.ConfigReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

/**
 * Created by dotcom on 5/11/17.
 */
public class TextFieldsControl extends BaseControl{

    private static Logger logger = LogManager.getLogger("TestLogger");


    public static void enterText(WebElement element, String requiredText){
        int time = Integer.parseInt(ConfigReader.getGlobalValue("default.time"));
        for(int counter = 0; counter <= time; counter++){
            if(isElementDisplayed(element) && isElementEnabled(element)){
                element.sendKeys(requiredText);
                logger.info("Has entered "+requiredText);
                return;
            }else{
                try {
                    Thread.sleep(500);
                    logger.warn("Waited for "+250 + " milliseconds");
                } catch (InterruptedException e) {
                    logger.error(e.getMessage());
                }
            }
            logger.trace("Unable to enter text "+requiredText);
            return;
        }
    }



}
