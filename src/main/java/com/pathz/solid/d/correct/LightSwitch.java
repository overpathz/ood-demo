package com.pathz.solid.d.correct;

public class LightSwitch {
    private LightBulb device;

    public LightSwitch(LightBulb device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
