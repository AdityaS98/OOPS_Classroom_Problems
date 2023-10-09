package com.bridelabz.oops3;


import com.bridelabz.oops_2.UtilityClass;

class Calculation {
    double length = UtilityClass.scannerDouble();
    double breadth = UtilityClass.scannerDouble();
    double height = UtilityClass.scannerDouble();

    public void volumeOfCuboid() {

        double vol = length * breadth + height;
        System.out.println("Volume of cuboid is " + vol);
    }
}

public class Cuboid {
    public static void main(String[] args) {

        System.out.println("Enter values");

        Calculation obj = new Calculation();
        obj.volumeOfCuboid();

    }
}
