package com.bridelabz.oops_1;

class Apparels {
    public String size;
    public String color;
    public double price;

    public Apparels(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void priceCalcuation() {

        double discount = 1;
        if (size.equals("medium")) {
            discount = 0.10;
        } else if (size.equals("Large")) {
            discount = 0.15;
        } else if (size.equals("Extra Large")) {
            discount = 0.20;
        }
        double finaldiscount = discount * price;
        System.out.println("Final Discount " + finaldiscount);
    }

    public void printInfo() {
        System.out.println("Colour of the shirt is" + color);
        System.out.println("Price of the shirt is" + price);
        System.out.println("Size of the shirt is " + size);
    }

}

public class Shirts {
    public static void main(String[] args) {
        Apparels obj = new Apparels("Medium", "Black", 500.50);
        obj.priceCalcuation();
        obj.printInfo();
    }
}
