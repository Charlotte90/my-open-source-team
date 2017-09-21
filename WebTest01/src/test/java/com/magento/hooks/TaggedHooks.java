package com.magento.hooks;

import com.magento.browserLib.BrowserFactory;
import com.magento.configManager.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by dotcom on 4/29/17.
 */
public class TaggedHooks {

// Tagged Hooks

    @Before({"@sanity"})
    public void setUpTaggedHooks()  {
        System.out.println("setting up sanity test");
    }


    @After({"@sanity"})
    public void cleanUpTaggedHooks(){
        System.out.println("Cleaning up sanity tests with tagged hooks");
    }

    @Before(value = {"@wip"}, order = 4, timeout = 5000)
    public void setUpTaggedHooks1()  {
        System.out.println("This is work in progress starting up 1");
    }


    @After(value = {"@wip"}, order = 4)
    public void cleanUpTaggedHooks1(){
        System.out.println("This is work in progress cleaning up 1");
    }

    @Before(value = {"@wip"}, order = 5)
    public void setUpTaggedHooks2()  {
        System.out.println("This is work in progress starting up 2");
    }


    @After(value = {"@wip"}, order = 5)
    public void cleanUpTaggedHooks2(){
        System.out.println("This is work in progress cleaning up 2");
    }
}
