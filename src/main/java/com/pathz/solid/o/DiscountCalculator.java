package com.pathz.solid.o;

public class DiscountCalculator {
    // gold
    public double calculateDiscount(String type) {
        if (type.equals("Normal")) {
            return 0.05;
        } else if (type.equals("Premium")) {
            return 0.1;
        } else if (type.equals("Gold")) {
            return 0.5;
        }
        return 0;
    }
}
