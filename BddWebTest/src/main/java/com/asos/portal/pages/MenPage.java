package com.asos.portal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dotcom on 09/03/17.
 */

public class MenPage extends BasePage {

    public MenPage(WebDriver driver) {
        super(driver);
    }

      public MenPage NewInShoesAndAccs() {
         driver.findElement(By.linkText("http://www.asos.com/men/")).click();
         driver.switchTo().activeElement();
         driver.findElement(By.className("standard")).click();
          return PageFactory.initElements(driver, MenPage.class);
      }
      public MenPage selectBelts() {
          driver.findElement(By.className("facetvalue-name")).click();
         driver.findElement(By.id("4")).click();
          return PageFactory.initElements(driver, MenPage.class);
      }
      public boolean validateblackbelts(String blackbelts){
          String BlackBeltsOnThePage= "6 styles";
         return driver.getPageSource().equalsIgnoreCase(BlackBeltsOnThePage);

      }
}




