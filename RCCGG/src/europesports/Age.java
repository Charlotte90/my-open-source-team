package europesports;

import java.util.Scanner;

/**
 * Created by ASUS on 03/01/2017.
 */
public class Age {



    public static void main (String[] args){
        System.out.println("Please enter your age ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age<18){
        System.out.println("Sorry cant take that");}
        else if (age==18){
        System.out.println("We are on track");}
        else if (age>18 && age<21)
        {  System.out.println("Just some month left ");}
        else System.out.println("Sorry  don't know you age ");

    }
}



