package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class GlutenFreeShop implements Producer {

    private static final List<String> PRODUCTS = List.of("Maka kokosowa", "Mleczko kokosowe", "orzechy wloskie", "woda kokosowa");

    public String getName() {
        return "GlutenFreeShop";
    }

    public boolean process(Order order) {
        if (PRODUCTS.contains(order.getProductType()) && order.getQuantity() > 1) {
            return true;
        }
        return false;
    }
}
