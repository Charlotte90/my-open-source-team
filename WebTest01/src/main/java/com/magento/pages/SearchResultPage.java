package com.magento.pages;

import com.magento.webControls.TextControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by dotcom on 5/27/17.
 */
public class SearchResultPage  extends BasePage{

    @FindBy(id = "product-price-2")
    private WebElement priceTag = null;
    @FindBy(id = "product-price-4")
    private WebElement tvPriceTag = null;

    public SearchResultPage(WebDriver expectedDriver) {
        super(expectedDriver);
    }


    public boolean validateIphonePrice(String price) {
        return TextControl.getText(priceTag).contains(price);
    }

    public boolean validateLgTvPrice(String tvPrice) {
        return TextControl.getText(tvPriceTag).contains(tvPrice);
    }
}
