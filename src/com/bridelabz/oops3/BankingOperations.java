package com.bridelabz.oops3;

class Bank {
    int amount;

    public Bank(int amount) {
        this.amount = amount;
    }

    public void displayAmountMessage() {
        System.out.println("This is the principle amount " + amount);
    }

    static class RateCalc {

        public int rate;

        public int time;
        public int principle;

        public int SI;


        public RateCalc(int rate, int time, int principle) {
            this.rate = rate;
            this.time = time;
            this.principle = principle;
        }

        public int simpleInterest() {
            SI = (principle * rate * time) / 100;

            return SI;
        }

        public void diplay(int SI) {
            System.out.println("Simple Interst is" + SI);
        }

    }

}

public class BankingOperations {
    public static void main(String[] args) {

        Bank obj = new Bank(1000);

        Bank.RateCalc obj1 = new Bank.RateCalc(7, 5, 10000);
        obj1.diplay(6);

    }
}
