package com.pathz.pattern.realexample;

public class GetPlayerDataRequestHandler implements Handler<GetPlayerDataRequest> {
    @Override
    public void handle(GetPlayerDataRequest request) {
        System.out.println("processing GetPlayerDataRequest request");
    }
}
