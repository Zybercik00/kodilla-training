package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Producer {

    public String getName() {
        return "HealthyShop";
    }

    public boolean process(Order order) {
        return false;
    }
}
