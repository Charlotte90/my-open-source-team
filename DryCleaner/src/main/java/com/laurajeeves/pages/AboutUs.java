package com.laurajeeves.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by ASUS on 18/04/2017.
 */
public class AboutUs extends BasePage {

    public AboutUs(WebDriver driver) {
        super(driver);
    }

    public  void aboutUs(){
           for (WebElement tag: driver.findElement(By.id("main-menu")).findElements(anchortag) ) {
            if (tag.getText().toLowerCase().equalsIgnoreCase("about us"))
                tag.click();
        }

        }
    }

