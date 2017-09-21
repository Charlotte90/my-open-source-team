package com.asos.portal.pages;

import com.asos.portal.utilities.CustomWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Danny on 13/05/2017.
 */
public class NewLookPage extends BasePage{
    @FindBy (id = "productlist-results")
       WebElement productElement = null;
    @FindBy(id = "productlist-results")
    WebElement productListElement = null;



    public NewLookPage(WebDriver driver) {
        super(driver);
    }

    public NewLookPage selectItem(){
        CustomWait.checkPageIsReady(driver, 25);
        WebElement rootElement = productElement.findElement(By.className("scrollable"));
        List<WebElement> spans  = rootElement.findElements(By.tagName("li"));
        for(WebElement span : spans){
            if(!span.getAttribute("data-name").equalsIgnoreCase("Belts")) continue;
            span.findElement(By.tagName("span")).click();
            break;
        }

        for(WebElement black : productListElement.findElement(By.className("two-column")).findElements(By.tagName("li"))){
            if(black.getAttribute("data-name").equalsIgnoreCase("Black")){
                black.findElement(By.tagName("span")).click();
                break;
            }

        }
        return PageFactory.initElements(driver, NewLookPage.class);
    }



    public boolean validateNumberOfBlackBelts(String blackBeltNumbers) {
        CustomWait.checkPageIsReady(driver, 30);
        return driver.getPageSource().contains(blackBeltNumbers);
    }
}
