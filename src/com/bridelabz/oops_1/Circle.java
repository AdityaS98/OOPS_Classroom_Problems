package com.bridelabz.oops_1;

// Write a Java program to create a class called "Circle" with an instance variable "radius."
// Include a method to calculate the area of the circle and a method to calculate the circumference of the circle.

class Mensuration{
     private int radius;

    public Mensuration() {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculateArea(double radius){
        double area = Math.PI*radius*radius;
        System.out.println("Area of a circle is "+area);
    }
    public void calculateCircumference(double  radius){
        double circumference = 2*Math.PI*radius;
        System.out.println("Circumference"+circumference);
    }

}
public class Circle {
    public static void main(String[] args) {
        Mensuration obj = new Mensuration();
        obj.calculateArea(12.5);
        obj.calculateCircumference(12.5);
    }
}
