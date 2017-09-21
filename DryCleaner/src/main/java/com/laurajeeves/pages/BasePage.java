package com.laurajeeves.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by ASUS on 18/04/2017.
 */
public class BasePage {
    WebDriver driver;

    private By search = (By.id("block-menu-menu-top-menu"));
    protected   By anchortag = By.tagName("a");


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void loadApplicationHomePage() {
        driver.navigate().to("http://www.laura-jeeves.com/");

    }

    public void homebutton() {
        List<WebElement> tags = driver.findElement(search).findElements(anchortag);
        for (WebElement tag : tags) {
            if (tag.getText().equalsIgnoreCase("home")) ;
            {   tag.click();
                break;
            }
        }
    }

    public void contactUs() {
        List<WebElement> tags = driver.findElement(search).findElements(anchortag);
        for (WebElement tag : tags) {
            if (tag.getText().equalsIgnoreCase("contact us")) ;
            {
                tag.click();
                break;
            }
        }
    }

    public void logIn() {
        List<WebElement> tags = driver.findElement(By.id("page")).findElements(anchortag);
        for (WebElement tag : tags) {
            if (tag.getText().equalsIgnoreCase("log-in")) ;
            { tag.click();
                break;
            }
        }
    }

    public void register() {
             List<WebElement> tags = driver.findElement(search).findElements(anchortag);
        for (WebElement tag : tags) {
            if (tag.getText().equalsIgnoreCase("register")) ;
            {
                tag.click();
                break;
            }
        }

      }
    public void  tsaLink(){
        driver.findElement(By.linkText(" www.tsa-uk.org")).click();
    }
}




