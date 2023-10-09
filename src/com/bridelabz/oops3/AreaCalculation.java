package com.bridelabz.oops3;


import com.bridelabz.oops_2.UtilityClass;

interface Shape {


    double area();

}

class Circle implements Shape {


    double r = UtilityClass.scannerDouble();


    @Override
    public double area() {

        return Math.PI * r * r;
    }
}

class Rectangle implements Shape {

    double l = UtilityClass.scannerDouble();
    double b = UtilityClass.scannerDouble();

    @Override
    public double area() {
        return l * b;
    }
}

public class AreaCalculation {
    public static void main(String[] args) {

        Shape obj = new Circle();
        System.out.println(obj.area());

        Shape obj1 = new Rectangle();
        System.out.println(obj1.area());

    }
}
