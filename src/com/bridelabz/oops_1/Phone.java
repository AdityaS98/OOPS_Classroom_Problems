package com.bridelabz.oops_1;

class MobilePhone {
    int make;
    String model;
    int storage;

    public MobilePhone(int make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public void priceCalculation(int price) {

        if (make <= 2023 && storage > 512) {
            price = price * 1000;

        } else if (make <= 2020 && storage < 256) {
            price = price * 500;

        } else if (make <= 2015 && storage < 128) {
            price = price * 250;

        } else if (make <= 2010 && storage < 64) {
            price = price * 125;

        } else {
            price = price * 63;
        }
        System.out.println("Price of the phone is " + price);
    }

    public void printInfo() {
        System.out.println("Year of make is " + make);
        System.out.println("Model of the phone is " + model);
        System.out.println("Storage is " + storage);

    }
}

public class Phone {
    public static void main(String[] args) {
        MobilePhone obj = new MobilePhone(2019, "Samsung A54", 512);
        obj.priceCalculation(1000);
        obj.printInfo();
    }
}
