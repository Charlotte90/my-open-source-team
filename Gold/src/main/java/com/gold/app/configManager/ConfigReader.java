package com.gold.app.configManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Danny on 29/04/2017.
 */
public class ConfigReader {

    public static String getValue(String keyName) throws IOException {
        String configPath = "\\src\\main\\resources\\test_report\\log_report\\GlobalConfig.properties";
        String sysPath = System.getProperty("user.dir");

        Properties config = new Properties();
        FileInputStream fileInputStream = null;

         fileInputStream = new FileInputStream(sysPath + configPath);
        config.load(fileInputStream);

        return config.getProperty(keyName);





//        Properties config = new Properties();
//
//        FileInputStream fileInputStream = new FileInputStream(sysPath + configPath);
//        config.load(fileInputStream);
//            return config.getProperty(keyName);

    }
}
