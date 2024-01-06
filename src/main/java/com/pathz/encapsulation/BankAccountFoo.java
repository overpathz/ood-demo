package com.pathz.encapsulation;

public class BankAccountFoo {
    public String accountNumber;
    public String ownerName;
    public double accBalance;
    public String pin;

    public BankAccountFoo(String accountNumber, String ownerName, String pin) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.pin = pin;
        this.accBalance = 0.0;
    }

    public double getBalance() {
        return accBalance;
    }

    public String deposit(double amount) {
        // Перевірка пін-коду перед здійсненням операції
        if (validatePin()) {
            accBalance += amount;
            return "Ваш баланс поповнено на " + amount + " грн.";
        } else {
            return "Неправильний пін-код. Операція відхилена.";
        }
    }

    public String withdraw(double amount) {
        // Перевірка пін-коду перед здійсненням операції
        if (validatePin()) {
            if (accBalance >= amount) {
                accBalance -= amount;
                return "Ви зняли " + amount + " грн. З вашого рахунку.";
            } else {
                return "Недостатньо коштів на рахунку.";
            }
        } else {
            return "Неправильний пін-код. Операція відхилена.";
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
