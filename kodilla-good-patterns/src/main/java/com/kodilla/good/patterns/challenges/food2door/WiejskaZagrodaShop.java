package com.kodilla.good.patterns.challenges.food2door;

public class WiejskaZagrodaShop implements Producer {

    public String getName() {
        return "WiejskaZagrodaShop";
    }

    public boolean process(Order order) {
        if (order.getProductType().equalsIgnoreCase("chleb")) {
            return true;
        }
        return false;
    }
}
