package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMargeritaBasic implements OrderPizza{

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(10);
    }

    @Override
    public String getAdds() {
        return "Mozzarella ";
    }
}
