package com.bridelabz.oops3;


import com.bridelabz.oops_2.UtilityClass;

abstract class Calculator {
    abstract int add(int a, int b);

    abstract int substract(int a, int b);

    abstract int multiply(int a, int b);

    abstract int divide(int a, int b);
}

class CalculatorOperation extends Calculator {
    public int add(int a, int b) {
        int add = a + b;
        System.out.println("Addition is " + add);
        return add;
    }

    @Override
    int substract(int a, int b) {
        int sub = a - b;
        System.out.println("Substraction :" + sub);
        return sub;
    }

    @Override
    int multiply(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication is " + mul);
        return mul;
    }

    @Override
    int divide(int a, int b) {
        int div = a / b;
        System.out.println("Division is" + div);
        return div;
    }

}

public class CalculationOOPS {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");

        int a = UtilityClass.scannerInt();
        int b = UtilityClass.scannerInt();

        CalculatorOperation obj = new CalculatorOperation();
        obj.add(a, b);
        obj.substract(a, b);
        obj.divide(a, b);
        obj.multiply(a, b);

    }
}
