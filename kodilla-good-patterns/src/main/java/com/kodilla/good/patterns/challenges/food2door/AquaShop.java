package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class AquaShop implements Producer{

    private static final List<String> PRODUCTS = List.of("Woda gazowana", "Woda nie gazowana");


    public String getName() {
        return "AquaShop";
    }

    public boolean process(Order order) {
        if (PRODUCTS.contains(order.getProductType())) {
            return true;
        }
        return false;
    }
}
