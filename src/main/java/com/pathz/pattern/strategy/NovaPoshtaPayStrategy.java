package com.pathz.pattern.strategy;

public class NovaPoshtaPayStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment using NovaPost credentials");
    }
}
