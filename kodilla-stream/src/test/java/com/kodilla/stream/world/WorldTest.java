package com.kodilla.stream.world;

import org.assertj.core.api.BigDecimalAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class WorldTest {

    @Test
    void testGetPeopleQuantity() {
        // given
        Country polska = new Country("Polska", BigDecimal.valueOf(40_000_000));
        Country niemcy = new Country("Niemcy", BigDecimal.valueOf(83_000_000));
        Country francja = new Country("Francja", BigDecimal.valueOf(67_000_000));
        Country hiszpania = new Country("Hiszpania", BigDecimal.valueOf(47_000_000));
        Country chiny = new Country("Chiny", BigDecimal.valueOf(1_400_000_000));
        Country rosja = new Country("Rosja", BigDecimal.valueOf(140_000_000));
        Country indie = new Country("Indie", BigDecimal.valueOf(1_300_000_000));
        Country tajlandia = new Country("Tajlandia", BigDecimal.valueOf(69_000_000));
        Country kongo = new Country("Kongo", BigDecimal.valueOf(89_000_000));
        Country zambia = new Country("Zambia", BigDecimal.valueOf(18_000_000));
        Country tanzania = new Country("Tanzania", BigDecimal.valueOf(59_000_000));
        Country usa = new Country("Stany Zjednoczone", BigDecimal.valueOf(329_000_000));
        Country canada = new Country("Kanada", BigDecimal.valueOf(38_000_000));
        Country columbia = new Country("Kolumbia", BigDecimal.valueOf(50_000_000));
        Country peru = new Country("Peru", BigDecimal.valueOf(32_000_000));

        Continent europa = new Continent("Europa", List.of(polska, niemcy, francja, hiszpania));
        Continent azja = new Continent("Azja", List.of(chiny, rosja, indie, tajlandia));
        Continent afryka = new Continent("Afryka", List.of(kongo,zambia, tanzania));
        Continent amerykaN = new Continent("Ameryka północna", List.of(usa, canada));
        Continent amerykaS = new Continent("Ameryka połódniowa", List.of(columbia, peru));

        World world = new World(List.of(europa, azja, afryka, amerykaN, amerykaS));

        // when
        BigDecimal result = world.getPeopleQuantity();

        // then
        BigDecimal liczba1 = new BigDecimal("3761000000");
        Assertions.assertEquals(liczba1, result);
    }
}
