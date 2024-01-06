package com.pathz.solid.o.correct;

public class GoldDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount() {
        return 0.5;
    }
}
