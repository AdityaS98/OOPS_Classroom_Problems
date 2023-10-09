package com.bridelabz.oops3;

class Outer {


    static int data1 = 20;
    static int data2 = 30;

    static class inner {

        void show() {

            int c = data1 + data2;
            System.out.println(c);
        }
    }
}

public class Outermain {
    public static void main(String[] args) {
        Outer.inner obj = new Outer.inner();

        obj.show();
    }

}
