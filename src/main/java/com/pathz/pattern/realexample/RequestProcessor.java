package com.pathz.pattern.realexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RequestProcessor {

    private final Map<Class<?>, Handler> handlerMap = new HashMap<>();

    public RequestProcessor() {
        handlerMap.put(GetPlayerDataRequest.class, new GetPlayerDataRequestHandler());
        handlerMap.put(DeleteSmth.class, new DeleteSmthRequestHandler());

        List<Object> of = List.of();
        Iterator<Object> iterator = of.iterator();
    }

    public void processRequest(Request request) {
        Handler handler = handlerMap.get(request.getType());
        handler.handle(request);
    }
}
