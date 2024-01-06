package com.pathz.solid.o.correct;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        double discount = discountCalculator.calculateDiscount(new GoldDiscountStrategy());
        System.out.println(discount);
    }
}
