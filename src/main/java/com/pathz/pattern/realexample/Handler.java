package com.pathz.pattern.realexample;

public interface Handler<T extends Request> {
    void handle(T request);
}
