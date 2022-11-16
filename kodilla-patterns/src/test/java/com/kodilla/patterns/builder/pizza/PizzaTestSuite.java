package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        Pizza pizza = new Pizza.PizzaBuldier()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();


        System.out.println(pizza);

        int howManyIngredients = pizza.getIngredients().size();

        assertEquals(3, howManyIngredients);
    }
}
