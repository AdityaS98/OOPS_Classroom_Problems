package com.bridelabz.oops3;

class Chaining {

    private int x;
    private int y;

    public Chaining() {
        System.out.println("Constructor with no argument");
    }

    public Chaining(int x) {
        this();
        System.out.println("Constructor with one argument");
    }

    public Chaining(int x, int y) {
        this(100);

        System.out.println("Constructor with two arguments");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {


        Chaining obj = new Chaining(10, 20);

    }
}
