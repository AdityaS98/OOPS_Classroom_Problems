
package com.bridelabz.oops_1;

import java.util.Scanner;

class ArmstrongNumb {
    private int number;

    public ArmstrongNumb() {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int armsstrongChecker(int n) {
        int temp = 0;
        int rem = 0;
        int arm = 0;
        n = temp;
        while (n > 0) {
            rem = n % 10;
            arm = (n * n * n) + arm;
            n = n / 10;
        }
        if (temp == n) {
            System.out.println("It is a Armstrong Number");
        } else {
            System.out.println("Not an armstrong Number");
        }
        return temp;
    }


}


public class Armstrongoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        ArmstrongNumb obj = new ArmstrongNumb();
        obj.armsstrongChecker(number);

    }
}
