package com.bridelabz.oops_2;

class Mensuration {
    double a;
    double b;

    public Mensuration(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateTriangleArea() {
        return 0.5 * a * b;


    }

    public double calculateRectangleArea() {
        return a * b;

    }

    static Mensuration createShape(double a, double b) {


        return new Mensuration(a, b);
    }

}

public class TriangleCalculation {
    public static void main(String[] args) {

        System.out.println("Enter sides");
        double s1 = UtilityClass.scannerDouble();
        double s2 = UtilityClass.scannerDouble();

        Mensuration obj = Mensuration.createShape(s1, s2);
        System.out.println("Area of rectangle is " + obj.calculateRectangleArea());
        System.out.println("Area of triangle is " + obj.calculateTriangleArea());


    }
}
//Enter sides
//2.5
//3.5
//Area of rectangle is 8.75
//Area of triangle is 4.375