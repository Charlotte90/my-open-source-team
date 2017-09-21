package com.asos.portal.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by KELVIN on 13/05/2017.
 */
public class ProductDisplayPage extends BasePage {

    @FindBy(className = "add-button")
    private WebElement addTobagButton = null;


    public ProductDisplayPage(WebDriver driver) {
        super(driver);
    }


    //@Kelvin - 13/05/2017. A method to add to bag
    public HomePage addProductToBag() throws InterruptedException {
        addTobagButton.click();
        return PageFactory.initElements(driver, HomePage.class);

    }


}
