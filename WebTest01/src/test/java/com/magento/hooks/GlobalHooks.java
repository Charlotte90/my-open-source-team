package com.magento.hooks;

import com.magento.database.DbUtils;
import cucumber.api.java.Before;

import java.sql.SQLException;

/**
 * Created by dotcom on 4/29/17.
 */

public class GlobalHooks extends Thread{

    private static boolean dunit = false;

    @Before(order = 1)
    public static void beforeAllTests() {
        if(!dunit) {
//            Code to run once at the beginning of the entire Test
            System.out.println("Run once at start time.........................");
            try {
                DbUtils.createConnection();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }



            Runtime.getRuntime().addShutdownHook(new Thread(){
                @Override
                public void run(){
//            		Codes to run at the end of the entire Test

                    System.out.println("Calling System.exit() ..................");
                    try {
                        DbUtils.shutConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }}
            );

            dunit = true;

        }
    }


}

