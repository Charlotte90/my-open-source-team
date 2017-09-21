package com.magento.database;

import com.magento.configManager.ConfigReader;

import java.sql.*;

/**
 * Created by dotcom on 5/20/17.
 */
public class DbUtils {


    //MYSQL DATABASE DETAILS

    private static String databaseName = null;
    private static Connection conn = null;
    private static String dBDriver = null;
    private static String dBUrl = null;
    private static String dBUsername = null;
    private static String dBPassword = null;


    public static boolean chooseDatabase(String databaseType){
        if(databaseType.toLowerCase().contains("my")){
            return setUpMySQLDatabase();
        }else if(databaseType.toLowerCase().contains("ms")){
            return setUpMsSqlDatabase();
        }else{
            return false;
        }
    }

    private static boolean setUpMsSqlDatabase() {
        dBDriver = ConfigReader.getMsSqlValue("database.driver");
        dBUsername = ConfigReader.getMsSqlValue("database.username");
        dBPassword = ConfigReader.getMsSqlValue("database.password");
        String databaseBaseUrl = ConfigReader.getMsSqlValue("database.base.url");
        databaseName = ConfigReader.getMsSqlValue("database.name");
        dBUrl = databaseBaseUrl + databaseName;
        return true;
    }

    private static boolean setUpMySQLDatabase() {
        dBDriver = ConfigReader.getMySqlValue("database.driver");
        dBUsername = ConfigReader.getMySqlValue("database.username");
        dBPassword = ConfigReader.getMySqlValue("database.password");
        String databaseBaseUrl = ConfigReader.getMySqlValue("database.base.url");
        databaseName = ConfigReader.getMySqlValue("database.name");
        dBUrl = databaseBaseUrl + databaseName;
        return true;
    }


    //Database Connection Code
    public static void createConnection() throws Throwable{
        boolean result = chooseDatabase(ConfigReader.getGlobalValue("database.type"));
        spinUpDbWhenNeeded(result);
    }


    private static void spinUpDbWhenNeeded(boolean result)throws Throwable{
        if(result){
            Class.forName (dBDriver).newInstance();
            conn = DriverManager.getConnection(dBUrl, dBUsername, dBPassword);
            if(!conn.isClosed()){
                System.out.println("Successfully connected to the " + databaseName);
            }else{
                System.err.println("Not connected to the "+databaseName);
            }
        }else{
            System.out.println("Database no needed");
        }
    }

    public static Connection getConnection(){
        return conn;
    }

    //	Database Query Method
    public static ResultSet runQuery(String query) throws SQLException{
        Statement statement = conn.createStatement();
        return statement.executeQuery(query);
    }


    public static ResultSet runStoredProcedure(String query) throws SQLException{
        CallableStatement statement = conn.prepareCall(query);
        //stmt.setInt(1, candidateId);
        return statement.executeQuery();
    }



    //  Database Closing code
    public static void shutConnection() throws SQLException{
        if (conn != null) {
            try {
                conn.close();
                System.out.println("MySQL Database closed");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
