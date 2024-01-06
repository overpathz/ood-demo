package com.pathz.polymorph;

import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Lviv");
        Transport transport = person.getGoogleNavigator().getNearestTransport();
        // Bus, Car, Tram
        transport.processTrip(person);
        System.out.println(transport.getType().getSimpleName());
    }
}
