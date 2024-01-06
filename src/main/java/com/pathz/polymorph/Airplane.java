package com.pathz.polymorph;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Airplane implements Transport {
    private final int id;
    private final String location;

    @Override
    public int getKmFrom(Person person) {
        return 100;
    }

    @Override
    public void processTrip(Person person) {
        log.info("[{} # {}] Перевозить {}", getType().getSimpleName(), getId(), person.getName());
    }

    @Override
    public int getTransportId() {
        return 5;
    }

    @Override
    public Class<? extends Transport> getType() {
        return Airplane.class;
    }
}
