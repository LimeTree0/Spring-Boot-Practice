package com.greglturnquist.hackingspringboot.reactive;

import reactor.core.publisher.Flux;

public class SimpleServer {

    private final KitchenService kitchen;

    SimpleServer(KitchenService kitchen) {
        this.kitchen = kitchen;
    }

    Flux<Dish> doingJob() {
        return this.kitchen.getDishes() //
                .map(dish -> Dish.deliver(dish));
    }
}
