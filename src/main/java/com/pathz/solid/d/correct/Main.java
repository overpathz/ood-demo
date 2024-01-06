package com.pathz.solid.d.correct;

public class Main {
    public static void main(String[] args) {
        LightBulb switchable1 = new LightBulb();;

        LightSwitch lightSwitch = new LightSwitch(switchable1);
        lightSwitch.operate();
    }
}
