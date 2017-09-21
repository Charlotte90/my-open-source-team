package com.asos.portal.pages;

import com.asos.portal.Infrastructure.filereader.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by dotcom on 09/03/17.
 */
public class BasePage {
    @FindBy(className = "selected-currency")
    private WebElement currencySelector = null;
    @FindBy(id = "currencyList")
    private WebElement currencyList = null;
    @FindBy(className = "saved-items")
    private WebElement savedItemsInTheBag = null;




    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
            }

    private BasePage prepareBrowser(){
        String baseUrl = ConfigReader.getObjectRepoValue("asos.dev.base.url");
        driver.manage().window().maximize();
        driver.navigate().to(baseUrl);
        return this;
    }
    public HomePage goToHomePage(){
        this.prepareBrowser();
        return PageFactory.initElements(driver, HomePage.class);
    }
    public HomePage changeCurrencyOrCountry() {
        currencySelector.click();
        driver.switchTo().activeElement();
        WebElement usd =currencyList;
        Select select =new Select(usd);
        select.selectByVisibleText("$ USD");
        driver.switchTo().defaultContent();
        return PageFactory.initElements(driver,HomePage.class);
    }
        public boolean uSValidation () {
            return driver.getPageSource().contains("$ USD");

        }

}



