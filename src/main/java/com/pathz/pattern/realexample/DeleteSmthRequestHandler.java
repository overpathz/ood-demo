package com.pathz.pattern.realexample;

public class DeleteSmthRequestHandler implements Handler<DeleteSmth> {
    @Override
    public void handle(DeleteSmth request) {
        System.out.println("processing delete request");
    }
}
