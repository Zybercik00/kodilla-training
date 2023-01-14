package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleCheeseDecorator extends AbstractPizzaOrderDecorator{

    protected DoubleCheeseDecorator(OrderPizza orderPizza) {
        super(orderPizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getAdds() {
        return "2x " + super.getAdds();
    }
}
