package com.magento.webControls;

import com.magento.configManager.ConfigReader;
import com.magento.waits.WebWaits;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

/**
 * Created by dotcom on 5/27/17.
 */
public class TextControl extends BaseControl{

    private static Logger logger = LogManager.getLogger("TestLogger");



    public static String getText(WebElement element){
        int time = Integer.parseInt(ConfigReader.getGlobalValue("default.time"));
        for(int counter = 0; counter <= time; counter++){
            if(isElementDisplayed(element) && isElementEnabled(element)){
                String text = element.getText();
                logger.info("Element text is "+text);
                return text;
            }else{
                WebWaits.checkPageReady(time);
                logger.warn("Waited as desired" +counter);
            }
        }
        logger.trace("Unable to grab any text");
        return "";
    }

}
