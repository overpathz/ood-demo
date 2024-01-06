package com.pathz.pattern.builder;

// Клас Director
public class CarDirector {
    public Car constructSportCar() {
        return new Car.Builder()
                .setMake("Porsche")
                .setModel("911")
                .setYear(2022)
                .setColor("Red")
                .build();
    }

    public Car constructSUV() {
        return new Car.Builder()
                .setMake("Toyota")
                .setModel("RAV4")
                .setYear(2022)
                .setColor("Blue")
                .build();
    }
}
