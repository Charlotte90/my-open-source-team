package com.gold.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Danny on 29/04/2017.
 */
public class HomePage extends BasePage{

    @FindBy(id = "citiesInput")
    private WebElement searchFieldElement = null;
    @FindBy(name = "checkin")
    private WebElement datePickerElement = null;




    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goToHotelSearch(){
        searchFieldElement.sendKeys("London");
        List<WebElement> searchTags = driver.findElement(By.id("childages")).findElements(By.tagName("button"));
        for(WebElement searchTag : searchTags){
            if(searchTag.getText().equalsIgnoreCase("Search")){
                searchTag.click();
                break;
            }
        }
        return PageFactory.initElements(driver,HomePage.class);

//        datePickerElement.click();
//        driver.switchTo().activeElement();

   }


    public boolean ListPriceOfHotel() {
        driver.getPageSource().contains("St. Pancras Renaissance…");
            return true;
        }
    }

