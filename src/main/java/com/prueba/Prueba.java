package com.prueba;

import io.vertx.core.AbstractVerticle;

public class Prueba extends AbstractVerticle {

    @Override
    public void start() {
        vertx
            .createHttpServer()
            .requestHandler(request -> request.response().end("Hola!"))
            .listen(8080);
    }
}