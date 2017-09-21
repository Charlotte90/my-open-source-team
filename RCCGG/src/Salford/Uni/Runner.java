package Salford.Uni;

import java.util.Scanner;

/**
 * Created by ASUS on 11/01/2017.
 */
public class Runner {



    public static void main (String [] args){
        System.out.println("Enter your number");

        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();


        System.out.println("Enter your number");
        Scanner scanner1 = new Scanner(System.in);
        int result1 = scanner.nextInt();


        System.out.println("Enter your number");
        Scanner scanner3 = new Scanner(System.in);
        int result3 = scanner.nextInt();

           Hospital hospital  = new Hospital(result, result1,result3 );
        int answer= hospital.getx();
        System.out.println(answer);




    }
}
