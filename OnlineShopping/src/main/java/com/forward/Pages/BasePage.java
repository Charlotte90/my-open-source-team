package com.forward.Pages;

import co.uk.next.fileReader.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by KELVIN on 26/03/2017.
 */
public class BasePage {

    protected final WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver=driver;
    }

    public BasePage browserSetUp() throws Exception {
        String baseUrl = ConfigReader.getValue("test_base_URL");
        driver.manage().window().maximize();
        driver.navigate().to(baseUrl);
        return PageFactory.initElements(driver, BasePage.class);

    }

    public HomePage goToHomePage() throws Exception {
        this.browserSetUp();
        return PageFactory.initElements(driver, HomePage.class);
    }





}
