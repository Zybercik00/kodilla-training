package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Producer {

    public String getName() {
        return "ExtraFoodShop";
    }

    public boolean process(Order order) {
        if (order.getQuantity() <= 1.5) {
            return true;
        }
        return false;
    }
}
