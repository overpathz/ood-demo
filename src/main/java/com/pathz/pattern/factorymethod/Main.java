package com.pathz.pattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        ItalianCoffeeFactory italianCoffeeFactory = new ItalianCoffeeFactory();
        CoffeeShop coffeeShop = new CoffeeShop(italianCoffeeFactory);
        Coffee coffee = coffeeShop.orderCoffee(CoffeeType.AMERICANO);
        System.out.println(coffee.getClass().getSimpleName());
    }
}
