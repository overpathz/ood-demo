package com.pathz.pattern.realexample;

public interface Request {
    Class<? extends Request> getType();
    String getBody();
}
