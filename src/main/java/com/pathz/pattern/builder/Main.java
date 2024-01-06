package com.pathz.pattern.builder;

// Використання паттерну
public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        Car sportCar = director.constructSportCar();
        Car suv = director.constructSUV();

        System.out.println(sportCar);
        System.out.println(suv);
    }
}

