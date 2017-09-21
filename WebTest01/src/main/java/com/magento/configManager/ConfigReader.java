package com.magento.configManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by dotcom on 21/02/17.
 */
public class ConfigReader {


    public static String getMsSqlValue(String keyName){
        String configPath = "/src/main/resources/MsSqlDatabase.properties";
        String sysPath = System.getProperty("user.dir");
        Properties config = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(sysPath+configPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            config.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config.getProperty(keyName);
    }


    public static String getMySqlValue(String keyName){
        String configPath = "/src/main/resources/MySqlDatabase.properties";
        String sysPath = System.getProperty("user.dir");
        Properties config = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(sysPath+configPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            config.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config.getProperty(keyName);
    }



    public static String getGlobalValue(String keyName){
        String configPath = "/src/main/resources/GlobalConfig.properties";
        String sysPath = System.getProperty("user.dir");
        Properties config = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(sysPath+configPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            config.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config.getProperty(keyName);
    }


    public static String getBrowserStackValue(String keyName) {
        String configPath = "/src/main/resources/BrowserStack.properties";
        String sysPath = System.getProperty("user.dir");
        Properties config = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(sysPath+configPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            config.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config.getProperty(keyName);
    }
}
