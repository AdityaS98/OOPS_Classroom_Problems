package com.bridelabz.oops_2;

class Count {
    static int count;

    public Count() {

        count++;
    }

    public static int intobjectCount() {
        return count;
    }
}

public class ObjectCounter {
    public static void main(String[] args) {
        Count obj = new Count();
        Count obj1 = new Count();
        Count obj2 = new Count();
        System.out.println(Count.intobjectCount());
    }
}
//3