package com.pathz.solid.o.correct;

public class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy) {
        return strategy.calculateDiscount();
    }
}

