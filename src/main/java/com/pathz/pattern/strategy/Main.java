package com.pathz.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Вибираємо стратегію оплати
//        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy paypalPayment = new PayPalPayment("john.doe@example.com");

        // Додаємо товари в кошик
//
//        // Оплата кредитною карткою
//        cart.setPaymentStrategy(creditCardPayment);
//        cart.checkout(100);

        // Оплата через PayPal
        cart.setPaymentStrategy(new NovaPoshtaPayStrategy());

        cart.checkout(50);
    }
}

