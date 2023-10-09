package com.bridelabz.oops_1;

class HomeDecoration {
    String type;
    String material;
    int price;

    public HomeDecoration(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public void priceCalculation() {
        double discount = 0.0, dicountfinal = 0;
        if (material.equals("Wood")) {
            discount = 0.10;
        } else if (material.equals("Plastic")) {

            discount = 0.20;
        } else if (material.equals("Metal")) {
            discount = 0.05;
        }
        dicountfinal = price * discount;
        System.out.println("Final DIscounted Price" + dicountfinal);
    }

    public void printInfo() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
    }

}

public class Furniture {
    public static void main(String[] args) {

        HomeDecoration obj = new HomeDecoration("Table", "Wood", 2000);
        obj.priceCalculation();
        obj.printInfo();

    }
}
