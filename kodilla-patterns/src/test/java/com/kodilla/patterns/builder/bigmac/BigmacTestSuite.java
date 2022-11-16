package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNweBigmac() {
        Bigmac bigmac = new Bigmac.BigmacBuldier()
                .bun("no sesame")
                .burgers(2)
                .sauce("1000 Island dressing")
                .ingredient("cucumber")
                .ingredient("onion")
                .build();

        int howManyIngredient = Bigmac.getIngredients().size();

        assertEquals(2, howManyIngredient);
    }
}
