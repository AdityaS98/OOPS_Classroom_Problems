package com.bridelabz.oops_2;

class Overloading {


    public int addSum(int a, int b) {
        return a + b;
    }

    public int addSum(int a, int b, int c) {
        return a + b + c;
    }

    public int addSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

public class ArthematicOperations {
    public static void main(String[] args) {

        System.out.println("Enter the 4 values");

        int a = UtilityClass.scannerInt();
        int b = UtilityClass.scannerInt();
        int c = UtilityClass.scannerInt();
        int d = UtilityClass.scannerInt();

        Overloading obj = new Overloading();
        System.out.println(obj.addSum(a, b));
        System.out.println(obj.addSum(a, b, c));
        System.out.println(obj.addSum(a, b, c, d));


    }
}
