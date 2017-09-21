package Salford.Uni;

import java.lang.reflect.Array;

/**
 * Created by ASUS on 08/01/2017.
 */
public class student {

    private String name = "Kunle";
    private int Age = 23;
    private double salary= 54000.00;
    private boolean kids = true;

       public void poly(String accounant, double ayo, long account, boolean kids){
           System.out.println( "my name is "+ accounant +"my salary is "  +ayo +
                   "our contact number is"+ account + kids +"We have Kids");
       }


    public void poly( String accounant, String ayo){
        System.out.println("My name is "+accounant + "my wife name is " +ayo );
    }


    public void poly( String accounant, int ayo){
        System.out.println( "My name is "+ accounant + "my age is " +ayo );
    }

    public void poly(String mike, double accounant, int ayo){
        System.out.println("My salary is "+accounant+" and my age is "+ayo);

    }

    public void poly( int accounant, int ayo){
        System.out.println("My Age is  "+ accounant +"  my wife age is  " +ayo);
    }



}

