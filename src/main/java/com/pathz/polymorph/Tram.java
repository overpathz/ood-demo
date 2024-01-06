package com.pathz.polymorph;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@RequiredArgsConstructor
@Slf4j
public class Tram implements Transport {
    private final int id;
    private final String location;

    @Override
    public int getKmFrom(Person person) {
        // розрахунок дистанції
        return DistanceChecker.getDistanceBetweenCities(getLocation(), person.getCity());
    }

    @Override
    public void processTrip(Person person) {
        log.info("[{} # {}] Перевозить {}", getType().getSimpleName(), getId(), person.getName());
    }

    @Override
    public int getTransportId() {
        return id;
    }

    @Override
    public Class<? extends Transport> getType() {
        return Tram.class;
    }
}
