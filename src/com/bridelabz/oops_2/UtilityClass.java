package com.bridelabz.oops_2;

import java.util.Scanner;

public class UtilityClass {

    public static Scanner sc = new Scanner(System.in);

    public static String scannerString() {


        String str = sc.nextLine();
        return str;

    }

    public static int scannerInt() {


        int num = sc.nextInt();
        return num;
    }

    public static int scannerChar() {


        char ch = sc.next().charAt(0);
        return ch;


    }

    public static double scannerDouble() {
        double duo = sc.nextDouble();
        return duo;
    }

    public static float scannerFloat() {
        float flo = sc.nextFloat();
        return  flo;
    }
}


