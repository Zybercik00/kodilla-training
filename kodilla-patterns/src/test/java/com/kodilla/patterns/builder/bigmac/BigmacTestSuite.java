package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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


        int ingredientsSize = Bigmac.getIngredients().size();

        assertEquals("no sesame", Bigmac.getBun());
        assertEquals(2, Bigmac.getBurgers());
        assertEquals("1000 Island dressing", Bigmac.getSauce());
        assertEquals(List.of("cucumber", "onion"), Bigmac.getIngredients());
        assertEquals(2, ingredientsSize);
    }
}
