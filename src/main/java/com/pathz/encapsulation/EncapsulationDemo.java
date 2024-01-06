package com.pathz.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount goodAccount = new BankAccount("0001", "Klymenko", "2511");
        BankAccountFoo fooAccount = new BankAccountFoo("0002", "Shevchuk", "2611");

        goodAccount.deposit(100);
        System.out.println(goodAccount.getBalance());

        String withdraw = goodAccount.withdraw(500);
        System.out.println(withdraw);
    }
}
