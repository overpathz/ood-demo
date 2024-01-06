package com.pathz.polymorph;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@RequiredArgsConstructor
public class GoogleNavigator {
    private final Person person;

    public Transport getNearestTransport() {
        List<Transport> allTransports = TransportDao.getInstance().getAll();

        for (Transport transport : allTransports) {
            int kmFrom = transport.getKmFrom(person);
            // шукаємо найближчий транспорт до цієї людини
        }

        return allTransports.get(new Random().nextInt(allTransports.size()));
    }
}
