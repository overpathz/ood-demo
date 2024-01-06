package com.pathz.solid;

public class SideEffect {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Some text");
    }
}

class Printer {
    public void print(String document) {
        // ..
        System.out.println(document);
        // save();
    }
}
