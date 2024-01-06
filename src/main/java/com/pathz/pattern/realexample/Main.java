package com.pathz.pattern.realexample;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RequestProcessor requestProcessor = new RequestProcessor();
        while (true) {
            requestProcessor.processRequest(generateRandomRequest());
            Thread.sleep(1000);
        }
    }

    private static Request generateRandomRequest() {
        boolean nextBoolean = ThreadLocalRandom.current().nextBoolean();
        if (nextBoolean) {
            return new DeleteSmth("delete body" + ThreadLocalRandom.current().nextInt(1000));
        } else {
            return new GetPlayerDataRequest("get body" + ThreadLocalRandom.current().nextInt(1000));
        }
    }
}
