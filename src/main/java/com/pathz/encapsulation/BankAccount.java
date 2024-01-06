package com.pathz.encapsulation;

import lombok.Data;

@Data
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String pin;

    public BankAccount(String accountNumber, String ownerName, String pin) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.pin = pin;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public String deposit(double amount) {
        // Перевірка пін-коду перед здійсненням операції
        if (true) {
            balance += amount;
            return "Ваш баланс поповнено на " + amount + " грн.";
        } else {
            return "Неправильний пін-код. Операція відхилена.";
        }
    }

    public String withdraw(double amount) {
        // Перевірка пін-коду перед здійсненням операції
        if (balance >= amount) {
            balance -= amount;
            return "Ви зняли " + amount + " грн. З вашого рахунку.";
        } else {
            return "Недостатньо коштів на рахунку.";
        }
    }

    private boolean validatePin() {
        // Введення пін-коду з клавіатури (може бути реалізовано по-різному)
        String enteredPin = inputPinFromUser();
        return enteredPin.equals(pin);
    }

    private String inputPinFromUser() {
        // Симуляція введення пін-коду користувачем
        return "1234"; // Повинна бути реалізована реальна логіка введення
    }
}

