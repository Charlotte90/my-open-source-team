package com.gold.app.pages;

import com.gold.app.configManager.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.List;

/**
 * Created by Danny on 29/04/2017.
 */
public class BasePage {

    @FindBy(className = "container")
    private WebElement hotelsElement = null;

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

//    private BasePage prepareBrowser() throws IOException {
//        String baseUrl = ConfigReader.getValue("php.dev.base.url");
//       driver.manage().window().maximize();
//        driver.navigate().to(baseUrl);
//        return this;
//    }

    public HomePage goToHomePage() throws IOException {
          driver.navigate().to(ConfigReader.getValue("php.dev.base.url"));
        return PageFactory.initElements(driver,HomePage.class);
//        this.prepareBrowser();
//        return PageFactory.initElements(driver, HomePage.class);
    }

    public void GoToHotelsTab() {
        List<WebElement> tags = hotelsElement.findElements(By.tagName("a"));
        for (WebElement tag : tags) {
            if (tag.getText().equalsIgnoreCase("home")) {
                tag.click();
                break;
            }
        }
    }


}
