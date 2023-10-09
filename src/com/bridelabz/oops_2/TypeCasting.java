package com.bridelabz.oops_2;

class Type {

    public int typecastingOperation(double a, double b) {

        int c = (int) (a + b);
        return c;
    }
}


public class TypeCasting {
    public static void main(String[] args) {

        System.out.println("Enter Numbers");
        double a = UtilityClass.scannerDouble();//double a = 1.2
        double b = UtilityClass.scannerDouble();// double b=1.2
        Type obj = new Type();
        System.out.println(obj.typecastingOperation(a, b));// int c =2

    }
}
