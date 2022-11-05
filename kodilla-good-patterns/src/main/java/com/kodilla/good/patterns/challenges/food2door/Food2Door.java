package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class Food2Door {

    private InformationSerivce informationSerivce;

    public Food2Door(InformationSerivce informationSerivce) {
        this.informationSerivce = informationSerivce;
    }

    private List<Producer> producers = new LinkedList<>();

    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    public void handle(Order order, String shopName) {

        boolean status = producers.stream()
                .filter(producer -> producer.getName().equals(shopName))
                .map(producer -> producer.process(order))
                .findFirst()
                .orElse(false);
        informationSerivce.inform(order, shopName, status);
    }
}
