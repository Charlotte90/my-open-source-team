package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends BasePage{

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getResult() {
        WebElement calculatorTextBox = driver.findElement(By.id("cwos"));
        String result = calculatorTextBox.getText();
        return result;
    }
}
