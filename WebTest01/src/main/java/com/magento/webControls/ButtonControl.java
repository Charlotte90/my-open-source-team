package com.magento.webControls;

import com.magento.configManager.ConfigReader;
import com.magento.waits.WebWaits;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

/**
 * Created by dotcom on 5/11/17.
 */
public class ButtonControl extends BaseControl{

    private static Logger logger = LogManager.getLogger("TestLogger");

    public static void clickButton(WebElement element){
        int time = Integer.parseInt(ConfigReader.getGlobalValue("default.time"));
        for(int counter = 0; counter <= time; counter++){
            if(isElementDisplayed(element) && isElementEnabled(element)){
                element.click();
                logger.info("Element is clicked");
                return;
            }else{
                WebWaits.checkPageReady(time);
                logger.info("Wait is applied "+counter);
            }

        }
    }


    public static String getButtonName(WebElement element){
        int time = Integer.parseInt(ConfigReader.getGlobalValue("default.time"));
        for(int counter = 0; counter <= time; counter++){
            if(isElementDisplayed(element) && isElementEnabled(element)){
                String text = element.getText();
                logger.info("Element text is "+text);
                return text;
            }else{
                WebWaits.checkPageReady(time);
            }
        }
        return null;
    }



}
