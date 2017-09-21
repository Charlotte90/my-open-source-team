package com.laurajeeves.test;

import com.laurajeeves.Hooks.HookTest;
import com.laurajeeves.pages.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by ASUS on 22/04/2017.
 */
public class RegisterClientsTest extends HookTest{

WebDriver driver;
    public void  registerNewClietTest(){
        BasePage basePage = new BasePage(driver);
        basePage.register();
        basePage.logIn();


    }

}
