package com.bridelabz.oops_1;

class Entertainment {
    String brand;
    int size;

    int price;


    public Entertainment(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;

    }

    public void televisionPrice() {
        double discount = 0;
        if (size < 32) {
            discount = 0.1;

        } else if (size >= 32 && size < 50) {
            discount = 0.15;

        } else {
            discount = 0.20;
        }

        discount = discount * price;
        System.out.println("Discount is " + discount);


    }

    public void printInfo() {
        System.out.println("Size of TV is" + size);
        System.out.println("Brand of TV is" + brand);
        System.out.println("Price of TV is" + price);

    }
}


public class Television {
    public static void main(String[] args) {

        Entertainment obj = new Entertainment("Sony", 32, 10000);
        Entertainment obj2 = new Entertainment("Samsung", 62, 70000);
        obj.televisionPrice();
        obj.printInfo();
        obj2.televisionPrice();
        obj2.printInfo();

    }
}
