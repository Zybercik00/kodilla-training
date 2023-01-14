package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaCapricciosaDecorator extends AbstractPizzaOrderDecorator{

    protected PizzaCapricciosaDecorator(OrderPizza orderPizza) {
        super(orderPizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getAdds() {
        return super.getAdds() + "+ ham + mushrooms";
    }
}
