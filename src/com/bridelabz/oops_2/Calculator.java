package com.bridelabz.oops_2;


class ArthermaticOperation {

    double x;
    double y;


    public double additionOperation(double x, double y) {
        double add = x + y;
        System.out.println("Addition is " + add);
        return add;
    }

    public double substractionOperation(double x, double y) {
        double sub = x - y;
        System.out.println("Substraction is " + sub);
        return sub;
    }

    public double multiplicationOperation(double x, double y) {
        double mul = x * y;
        System.out.println("Multiplication is " + mul);
        return mul;
    }

    public double divisionOperation(double x, double y) {
        double mul = x / y;
        System.out.println("Divivion is " + mul);
        return mul;
    }
}


public class Calculator extends ArthermaticOperation {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        double num1 = UtilityClass.scannerDouble();
        double num2 = UtilityClass.scannerDouble();


        ArthermaticOperation obj = new ArthermaticOperation();
        obj.additionOperation(num1, num2);
        obj.substractionOperation(num1, num2);
        obj.multiplicationOperation(num1, num2);
        obj.divisionOperation(num1, num2);


    }
}
//Enter the numbers
//10
//5
//Addition is 15.0
//Subtraction is 5.0
//Multiplication is 50.0
//Division is 2.0

