package com.bridelabz.oops_2;

class Cuboid {
    double length;
    double breadth;
    double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double calculateArea() {
        double area = 2 * ((length * breadth) + (breadth + height) + (length + height));
        System.out.println("Area is" + area);
        return area;
    }

    public double calculateVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume is" + volume);
        return volume;
    }

    public double calculatePerimeter() {
        double perimeter = 4 * (length + breadth + height);
        System.out.println("Perimeter is" + perimeter);
        return perimeter;

    }


}

public class NestingMethods {
    public static void main(String[] args) {

        System.out.println("Enter the dimensions");

        double length = UtilityClass.scannerDouble();
        double breadth = UtilityClass.scannerDouble();
        double height = UtilityClass.scannerDouble();

        Cuboid obj = new Cuboid(length, breadth, height);
        obj.calculateArea();
        obj.calculateVolume();
        obj.calculatePerimeter();
    }
}

/*
Enter the dimensions
2.5
3.5
5.5
Area is51.5
Volume is48.125
Perimeter is46.0

 */