package main.java;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class Main extends AbstractVerticle {

    @Override
    public void start() {
        vertx
            .createHttpServer()
            .requestHandler(request -> request.response().end("Hola!"))
            .listen(8080);
    }
}