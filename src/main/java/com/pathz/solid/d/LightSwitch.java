package com.pathz.solid.d;

public class LightSwitch {
    private LightBulb bulb = new LightBulb(); // ?

    public void operate() {
        bulb.turnOn();
    }
}

