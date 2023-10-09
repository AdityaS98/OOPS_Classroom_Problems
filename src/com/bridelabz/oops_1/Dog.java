  package com.bridelabz.oops_1;

class Pets {
    String breed;
    int weight;

    public Pets(String breed, int weight) {
        this.breed = breed;
        this.weight = weight;
    }

    public void getAge(int age) {

        int dogage = 0;
        if (age <= 1) {
            dogage = age * 15;
        } else if (age <= 2) {
            dogage = age * 9;
        } else {
            dogage = 5 * age;

        }
        System.out.println("Breed " + breed);
        System.out.println("Weight " + weight);
        System.out.println("Age of dog is " + dogage);
    }
}

public class Dog {
    public static void main(String[] args) {

        Pets obj = new Pets("Cane Corso", 12);
        obj.getAge(25);
    }
}
