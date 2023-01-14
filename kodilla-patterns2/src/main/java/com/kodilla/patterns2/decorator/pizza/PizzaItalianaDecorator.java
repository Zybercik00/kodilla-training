package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaItalianaDecorator extends AbstractPizzaOrderDecorator{

    protected PizzaItalianaDecorator(OrderPizza orderPizza) {
        super(orderPizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }


    @Override
    public String getAdds() {
        return super.getAdds() + "+ prosciutto";
    }
}
