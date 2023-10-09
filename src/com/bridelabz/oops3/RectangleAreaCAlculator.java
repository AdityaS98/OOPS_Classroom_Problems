package com.bridelabz.oops3;


import com.bridelabz.oops_2.UtilityClass;

class AreaCalculator {


    public void areaCalculation(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area is " + area);
    }

    // public void inputDetails() {
    //  System.out.println("Enter length");

    //double length = UtilityClass.scannerDouble();
    //double breadth = UtilityClass.scannerDouble();

}


public class RectangleAreaCAlculator {
    public static void main(String[] args) {

        System.out.println("Enter Details");
        double length = UtilityClass.scannerDouble();
        double breadth = UtilityClass.scannerDouble();


        AreaCalculator obj = new AreaCalculator();
        obj.areaCalculation(length, breadth);


    }
}
