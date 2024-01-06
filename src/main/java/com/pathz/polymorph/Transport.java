package com.pathz.polymorph;

public interface Transport {
    int getKmFrom(Person person);
    void processTrip(Person person);
    int getTransportId();
    Class<? extends Transport> getType();
}