package Car_Intro;

import java.util.Scanner;

/**
 * Created by ASUS on 21/12/2016.
 */
public class BMW_Insurance {

    public void Insuarnce(){


        System.out.println("Please is your finance deal Approved?");
        Scanner scanner = new Scanner(System.in);
        boolean deal = scanner.nextBoolean();
        if (deal == true)
        System.out.println("We can Proceed with the application");
        else System.out.println( "sorry i cant Help, please call our Help Line on 09090909");

        BMW_Finance car = new BMW_Finance();
        car.Name();
        car.occuption();
        car.Licence();







    }}







