package com.pathz.pattern.factorymethod;

public class ItalianCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new ItalianAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianEspresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino(); //
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte(); //
                break;
        }

        return coffee;
    }
}

