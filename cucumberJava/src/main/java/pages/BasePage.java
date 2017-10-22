package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public GoogleHomePage visitGoogleHomePage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in");
        return new GoogleHomePage(driver);
    }
}
