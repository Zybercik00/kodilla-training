package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {

    private List<Continent> continents;

    // konstrunktor
    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal result = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (x, y) -> x.add(y));
        return result;
    }
}



//World -> Azja -> Rosja, Ukraina, Chiny, Japonia ....
//      -> Afryka -> RPA, Egipt, Algieria
//      -> Europa -> Polsa, Szwajcaria, Niemcy
//
//
//Rosja, Ukraina, Chiny, Japonia, RPA, Egipt, Algieria, Polsa, Szwajcaria, Niemcy