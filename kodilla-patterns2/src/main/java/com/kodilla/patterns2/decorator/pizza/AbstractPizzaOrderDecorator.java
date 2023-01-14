package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements OrderPizza {

    private final OrderPizza orderPizza;

    protected AbstractPizzaOrderDecorator(OrderPizza orderPizza) {
        this.orderPizza = orderPizza;
    }

    @Override
    public BigDecimal getPrice() {
        return orderPizza.getPrice();
    }

    @Override
    public String getAdds() {
        return orderPizza.getAdds();
    }

}
