package com.bridelabz.oops_2;

class SuperClass {
    String superString;


    SuperClass() {
        superString = "This is the SuperClass";
    }


    SuperClass(String str) {
        superString = str;
    }
}

class SubClass extends SuperClass {
    String subString;


    SubClass(String superStr, String subStr) {
        super(superStr);
        subString = subStr;
    }

    void printStrings() {
        System.out.println("Superclass String: " + superString);
        System.out.println("Subclass String: " + subString);
    }
}


public class MainCla {
    public static void main(String[] args) {

        SubClass subObj = new SubClass("Hello from SuperClass", "Hello from SubClass");
        subObj.printStrings();

    }
}
