package Salford.Uni;

import java.util.Scanner;

/**
 * Created by ASUS on 11/01/2017.
 */

public class School {
    private int a;
    private int b;
    private double c;
    public School(int a, int b) {

        this.a =a;
        this.b =b;
        this.c =c;
    }

    public int getB() {
        return b+a;
    }


    public int geta( ) {
        return a*b;
    }

    public void setC(double c) {
        this.c = c;
    }
}

