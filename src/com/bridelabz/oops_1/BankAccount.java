package com.bridelabz.oops_1;

class Bank{
    private int balance;
    private int accountNumber;

    public Bank(int balance, int accontNumber) {
        this.balance = balance;
        this.accountNumber = accontNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void depositAmount(int deposit){

        balance = balance+deposit;
        System.out.println("Deposit Balance"+balance);


    }
    public void withdrawAmount(int withdraw){

        if(balance<withdraw){
            System.out.println("Not Sufficient Balacne");
        }
        else {
            balance = balance-withdraw;
            System.out.println("Remaining Amount"+balance);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}

public class BankAccount {
    public static void main(String[] args) {

        Bank obj = new Bank(10000,1234);
        System.out.println(obj);
        obj.depositAmount(1000);
        obj.withdrawAmount(150);

    }
}
