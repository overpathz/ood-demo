package com.pathz.polymorph;

import java.util.concurrent.ThreadLocalRandom;

public final class DistanceChecker {
    public static int getDistanceBetweenCities(String city1, String city2) {
        return ThreadLocalRandom.current().nextInt(100);
    }
}
