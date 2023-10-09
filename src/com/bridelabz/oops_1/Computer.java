package com.bridelabz.oops_1;

class Processor {
    String processor;
    int ram;
    int storage;


    public Processor(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;


    }

    public void priceCalculation() {
        double basePrice = 500.0;
        double ramPrice = 0.0;
        double storagePrice = 0.0;

        if (processor.equals("Intel")) {
            ramPrice = ram * 5.0;
            storagePrice = storage * 0.1;

        } else if (processor.equals("Intel")) {
            ramPrice = ram * 6.0;
            storagePrice = storage * 0.2;
        }
        double totalPrice = basePrice + ramPrice + storagePrice;
        System.out.println("Total Price is " + totalPrice);

    }

    public void printInfo() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");

    }

}

public class Computer {
    public static void main(String[] args) {

        Processor obj = new Processor("Intel I7", 16, 500);
        obj.priceCalculation();
        obj.printInfo();

    }
}
