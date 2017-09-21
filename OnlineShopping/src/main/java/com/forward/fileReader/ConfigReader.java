package com.forward.fileReader;

import java.util.Properties;


/**
 * Created by KELVIN on 22/02/2017.
 */
public class ConfigReader {




    public static String getValue(String keyValue) throws Exception{
        Properties prop = new Properties();
        prop.load(ClassLoader.getSystemClassLoader().getResourceAsStream("env.properties"));
        return prop.getProperty(keyValue);
    }

}
