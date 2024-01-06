package com.pathz.solid.l;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        takeBird(bird);
    }

    public static void takeBird(Bird bird) {
        bird.fly();
    }
}
