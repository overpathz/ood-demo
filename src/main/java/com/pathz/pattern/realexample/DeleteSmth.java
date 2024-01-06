package com.pathz.pattern.realexample;

public class DeleteSmth implements Request {
    private final String body;

    public DeleteSmth(String body) {
        this.body = body;
    }

    @Override
    public Class<? extends Request> getType() {
        return DeleteSmth.class;
    }

    @Override
    public String getBody() {
        return body;
    }
}
