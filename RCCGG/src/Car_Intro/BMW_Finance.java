package Car_Intro;

import java.util.Scanner;

/**
 * Created by ASUS on 21/12/2016.
 */
public class BMW_Finance {

    public void salary(){
        double salary = 30.000;
        int age = 18;
        System.out.println("Please provide age and Income per Annum");
        Scanner scanner = new Scanner(System.in);
        double Income = scanner.nextDouble();
        int Age = scanner.nextInt();
        if (salary<salary  && age<age)
        System.out.println("Sorry Minimum  salary is"  + salary +  "Minimum Age is "   +age  +"To continue with the application");
        else if (salary>=salary  && age>=age)
        System.out.println("Congratulation we can now proceed with the rest of the application, Thank you");
        else if (salary>=salary  && age<= age)
        System.out.println("Please call Our customer service for consideration");
        else if (salary<salary && age>=age)
        System.out.println("Sorry " + salary  + "is not enough  you are " + age  );
        else System.out.println(" Sorry I cant Help you at the moment, Call our Help Team on 0909099990");

    }


    public void Name(){
        System.out.println("Please Enter Your Name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Thank you " + name);
    }

    public  void occuption(){

        System.out.println ("Provide your occupation please ");
        Scanner scanner = new Scanner(System.in);
        String occupation = scanner.next();
    }

    public void Address (){
        System.out.println("Please enter your address");
        Scanner scanner = new Scanner(System.in);
        String Address = scanner.next();
    }


    public void Licence(){
        boolean licence = true;
        System.out.println("DO you Have Full UK Driving Licence?");
        Scanner  scanner = new Scanner(System.in);
        boolean licenece = scanner.nextBoolean();
    }



}


