package com.pathz.polymorph;

import java.util.List;

public final class TransportDao {
    public List<Transport> getAll() {
        return List.of(new Bus(1, "Lviv"),
                new Tram(2, "Lviv"),
                new Car(3, "Lviv"),
                new Bus(4, "Lviv"),
                new Airplane(5, "Kyiv"));
    }

    private TransportDao() {}

    private static TransportDao INSTANCE;

    public static TransportDao getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        return new TransportDao();
    }
}
