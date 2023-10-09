package com.bridelabz.oops_2;

class AreaCalculation {
    public double areaCalculation(double r) {
        return Math.PI * r * r;
    }

    public double areaCalculation(int side) {
        return side * side;
    }

    public double areaCalculation(int length, int breadth) {
        return 0.5 * length * breadth;
    }
}

public class Mensurations {
    public static void main(String[] args) {

        System.out.println("Enter radius");
        double r = UtilityClass.scannerDouble();

        System.out.println("Enter side ");
        int side = UtilityClass.scannerInt();

        System.out.println("Enter side of rectangle");
        int length = UtilityClass.scannerInt();
        int breadth = UtilityClass.scannerInt();

        AreaCalculation obj = new AreaCalculation();
        System.out.println("Circle Area" + obj.areaCalculation(r));
        System.out.println("Square Area " + obj.areaCalculation(side));
        System.out.println("Rectangle Area" + obj.areaCalculation(length, breadth));


    }

}

//Enter radius
//2.6
//Enter side
//4
//Enter side of rectangle
//2
//3
//Circle Area 21.237166338267002
//Square Area 16.0
//Rectangle Area 3.0
