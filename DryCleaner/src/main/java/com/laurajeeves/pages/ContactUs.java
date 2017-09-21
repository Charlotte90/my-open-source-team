package com.laurajeeves.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ASUS on 18/04/2017.
 */
public class ContactUs extends BasePage {
    protected By laundry = By.id("edit-submitted-i-am-interested-in-1");
    protected By ironing = By.id("edit-submitted-i-am-interested-in-2");
    protected By drycleaning = By.id("edit-submitted-i-am-interested-in-3");
    protected  By weddingdresscleaning = By.id("edit-submitted-i-am-interested-in-4");
    protected By couture = By.id("edit-submitted-i-am-interested-in-5");
    protected By ozonetreatment = By.id("edit-submitted-i-am-interested-in-6");
    protected By arrangecollection = By.id("edit-submitted-i-am-interested-in-7");
    protected By textarea = By.id("edit-submitted-message");
    protected By email = By.id("edit-submitted-e-mail");
    protected String email1 = "edit-submitted-i-am-interested-in-1";
    protected By name = By.id("edit-submitted-name");
    protected By telephone = By.id("edit-submitted-telephone");
    protected By postcode = By.id("edit-submitted-postcode");

    protected  By submitrequest= By.id("edit-submit");

    public ContactUs(WebDriver driver) {
        super(driver);
    }


    public void submitDetails() {

          String clientTelephonenumber = "02020222";
        String clientPostcodeAdress = "m60009";
        driver.findElement(email).sendKeys( "AyoAutomation@Gmail.com");
        driver.findElement(name).sendKeys("Mike");
        driver.findElement(telephone).sendKeys(clientTelephonenumber);
        driver.findElement(postcode).sendKeys(clientPostcodeAdress);
    }

    public void checklaundryBoxe() {
        boolean select = driver.findElement(laundry).isSelected();
        if (select != true) {
            driver.findElement(By.id(email1)).click();
    }

            boolean select2 = driver.findElement(ironing).isSelected();
            if (select2 != true) {
                driver.findElement(ironing).click();

        }}
    public void checkdrycleaningbox() {
        boolean select3 = driver.findElement(drycleaning).isSelected();
        if (select3 != true) {
            driver.findElement(drycleaning).click();
        }


        boolean select5 = driver.findElement(couture).isSelected();
        if (select5 != true) {
            driver.findElement(couture).click();

    }
        boolean select6 = driver.findElement(ozonetreatment).isSelected();
        if (select6 != true) {
            driver.findElement(ozonetreatment).click();

    }
        boolean select7 = driver.findElement(arrangecollection).isSelected();
        if (select7 != true) {
        driver.findElement(arrangecollection).click();
    }
    }





    public void sendTexTotArea() {
        String textareamessage = "just for testing purposes ";
        driver.findElement(textarea).sendKeys(textareamessage);
    }

    public  void  submitEnquiriesForm(){
        driver.findElement(submitrequest).click();
    }
}

