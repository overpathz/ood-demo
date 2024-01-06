package com.pathz.pattern.realexample;

public class GetPlayerDataRequest implements Request {
    private final String body;

    public GetPlayerDataRequest(String body) {
        this.body = body;
    }

    @Override
    public Class<? extends Request> getType() {
        return GetPlayerDataRequest.class;
    }

    @Override
    public String getBody() {
        return body;
    }
}
