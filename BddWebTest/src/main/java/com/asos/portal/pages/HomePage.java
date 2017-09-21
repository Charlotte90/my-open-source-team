package com.asos.portal.pages;

import com.asos.portal.utilities.CustomWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by dotcom on 14/03/17.
 */
public class HomePage extends BasePage {

    @FindBy(id = "anonymous")
    private WebElement anonymousElement = null;


    @FindBy(id = "txtSearch")
    private WebElement searchTextBox = null;

    @FindBy(className = "facetvalue-name")
    private WebElement GoldSocksCheckBox = null;

    @FindBy(className = "go")
    private WebElement searchButton = null;



    @FindBy(className = "bag-link-price")
    private WebElement viewBaglink = null;



    @FindBy(id = "txtSearch")
    private WebElement productSearchField = null;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AccountPage goToAccountPage() {
        for (WebElement anchorTag : anonymousElement.findElements(By.tagName("a"))) {
            if (!anchorTag.getText().toLowerCase().contains("sign in")) continue;
            anchorTag.click();
            break;
        }
        return PageFactory.initElements(driver, AccountPage.class);
    }

    public boolean validatelogout(String message) {
        return driver.getPageSource().toLowerCase().contains(message.toLowerCase());
    }

    public HomePage SearchBox() {
        searchTextBox.sendKeys("socks");
        searchButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public HomePage selectGoldsocks() {
        GoldSocksCheckBox.click();
        return PageFactory.initElements(driver, HomePage.class);
    }
        public boolean validateGoldSocks(){
        String GoldSocksConfimed ="5 styles found";
       return driver.getPageSource().contains(GoldSocksConfimed) ;
    }

    //@Kelvin and Ken - 13/05/2017 Product search method.
    public ProductDisplayPage productSearch(String productNumber) {
        productSearchField.sendKeys(productNumber);
        searchButton.click();
        return PageFactory.initElements(driver, ProductDisplayPage.class);

    }

    //Kelvin: 13/05/2017 - Method to Verify that product has been added to bag
    public boolean verifyProductAddedToBag(String productPrice) {
        CustomWait.checkPageIsReady(driver, 60);
        String bagPrice = viewBaglink.getText();
        return bagPrice.contains(productPrice);
    }
    private WebElement menElement(WebDriver driver){
        WebElement rootElement = driver.findElement(By.className("nav-hdrlinks-wrap")).findElement(By.className("site-navigation"));
        List<WebElement> spanHeaders = rootElement.findElements(By.tagName("span"));
        for(WebElement spanHeader : spanHeaders){
            if(spanHeader.getText().equalsIgnoreCase("MEN")) return spanHeader;
        }
        return null;
    }

    public NewLookPage mouseHoverMen(){
        WebElement mElement = menElement(driver);
        Actions builder = new Actions(driver);
        builder.moveToElement(mElement).moveToElement(driver.findElement(By.xpath(".//*[@id='BodyTag']/div[4]/div/header/div[5]/nav/ul/li[3]/div/dl[2]/dd/ul/li[11]/a"))).click().build().perform();

        return PageFactory.initElements(driver,NewLookPage.class);
    }
}
