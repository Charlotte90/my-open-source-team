package New;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by ASUS on 18/12/2016.
 */
public class Practice1 {
     private int a = 10;
    private int b = 11;
    private int result = a + b;
            public void Newstuff(){
    {
        System.out.println(result);
        if (a < 11)
            System.out.println("I am Great " + a);
        else if (b >= a)
            System.out.println("Great is in me " + b);
        else System.out.println("Nobody Knows what you want");
    }}

    public void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (age <= 18)
            System.out.println("Sorry we cant accept that");
        else if (age > 18)
            System.out.println("You are welcome to the club");
        else System.out.println("Sorry i don't get that");

    }

    public void Array() {
        int student[] = new int[6];
        student[1] = 1;
        student[2] = 4;
        student[3] = 78;
        student[4] = 29;
        System.out.println("Please enter your grade");
        Scanner scanner = new Scanner(System.in);
        int studentname = scanner.nextInt();
        if (student[2] < student[3])
            System.out.println("Nice Job");
        else if (student[1] == student[4])
            System.out.println("sorry we cant accept that");
        else if (student[3] >= student[1]) ;
        else System.out.println("sorry that is not available");
    }


    public void forloop() {

      for (int a = 2; a <= 50; a += 2)
            System.out.println(a);}

        public void while1 () {

        int a = 0;
        while (a<10) {
            System.out.println(a);}
        if (a==4);
        System.out.println();
    }


    public void Array2() {

        int kidsname[] ={2,217,48,34,90,10};
       System.out.println(kidsname[2]);}


    public void IndexandValue(){
        System.out.println("index \tvalue");
        int pupilsname[]= {23,54,65,67,56,32,78,54,56};
        for (int ayo=0; ayo<pupilsname.length;ayo++)
            System.out.println(ayo + "\t" + pupilsname[ayo]);
    }

    public void array1(){
        System.out.println("index\tvalue");
        int student[]={23,23,89,87,76,100,876};
        for(a=0;a<student.length;a++)
        {
            System.out.println(a+ "    \t"+student[a]);
        }}

    public void salary(){

        double salary[]= new double[4];
        salary[0]= 23000.00;
        salary[1]= 24000.00;
        salary[2]= 25000.00;
        salary[3]= 26000.00;
        System.out.println(salary.length);
    }


    public  void  Tenants() {
        int age = 25;
        String Tenants[] = {"Mike", "Peter", "Dennis", "Ronald", "Nigel"};
        System.out.println("Enter Tenant Name ");
        Scanner scanner= new Scanner(System.in);
        String tena = scanner.next();
        if (age<25)
        System.out.println("Sorry");
        else if (age>=25);
        System.out.println("Welcome!");
        while (age>25);
        System.out.println(Tenants[4]);

    }





    public void Time(){


        Date date = new Date();
        date.getTime();
        System.out.println(date);
    }
}






