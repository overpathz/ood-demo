package com.pathz.solid.l;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пінгвіни не літають");
    }
}
