package com.laurajeeves.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by ASUS on 18/04/2017.
 */
public class Services extends BasePage {

    private By servicesMenu = (By.id("secondary-menu"));

    public Services(WebDriver driver, By servicesMenu) {
        super(driver);
        this.servicesMenu = servicesMenu;
    }

    public void loundry() {
             for (WebElement tag : driver.findElement(servicesMenu).findElements(anchortag)) {
            if (tag.getText().toLowerCase().contains("laundry")) ;
            tag.click();
       ;
            break;
        }

    }

    public void drycleanng() {
        for (WebElement tag : driver.findElement(servicesMenu).findElements(anchortag)) {
            if (tag.getText().toLowerCase().contains("drycleanng")) ;
            tag.click();
            break;

        }

    }

    public void ironing() {
        for (WebElement tag : driver.findElement(servicesMenu).findElements(anchortag)) {
            if (tag.getText().toLowerCase().contains("ironing")) ;
            tag.click();
            break;
        }
    }

    public void alteration() {
        for (WebElement alt : driver.findElement(servicesMenu).findElements(anchortag)) {
            if (alt.getText().toLowerCase().contains("alteration")) ;
            alt.click();
            break;
        }
    }

    public void specialgarmentsandgown() {
            String pageconfirmed ="Special Garments";
        for (WebElement garment : driver.findElement(servicesMenu).findElements(anchortag)) {
            if (garment.getText().toLowerCase().equalsIgnoreCase("special garments and gown")) ;
            garment.click();
            Assert.assertTrue(true, pageconfirmed);
            break;

        }
    }

    public void duvetMenu() {
        List<WebElement> duvets = driver.findElement(servicesMenu).findElements(anchortag);
        for (WebElement duvet : duvets) {
            if (duvet.getText().toLowerCase().contains("duvet")) ;
            duvet.click();
            break;
        }
    }

    public void shirtMenu() {
        for (WebElement shirt : driver.findElement(servicesMenu).findElements(anchortag)) {
            if (shirt.getText().toLowerCase().contains("shirts")) ;
            shirt.click();
            break;

        }
    }

    public void bedLinen() {
        for (WebElement bed : driver.findElement(servicesMenu).findElements(anchortag)) {
            if (bed.getText().equalsIgnoreCase("bedlinen")) ;
            bed.click();
            break;
        }
    }

    public void handBag() {
        List<WebElement> bags = driver.findElement(servicesMenu).findElements(anchortag);
        for (WebElement bag : bags) {
            if (bag.getText().toLowerCase().contains("handbag")) ;
        }
    }

    public void kidsclothes() {
        List<WebElement> kids = driver.findElement(servicesMenu).findElements(anchortag);
        for (WebElement kid : kids) {
            if (kid.getText().equalsIgnoreCase("kids' clothes")) ;
            kid.click();
            break;
        }

    }

    public void ozone() {
        List<WebElement> ozones = driver.findElement(servicesMenu).findElements(anchortag);
        for (WebElement ozone : ozones) {
            if (ozone.getText().equalsIgnoreCase("ozone")) ;
            break;

        }
    }
}
