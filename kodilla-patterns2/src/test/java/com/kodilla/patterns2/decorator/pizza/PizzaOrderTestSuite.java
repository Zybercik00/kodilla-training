package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaItaliana() {
        OrderPizza theOrder = new PizzaMargeritaBasic();
        theOrder = new PizzaItalianaDecorator(theOrder);
        BigDecimal thePrice = theOrder.getPrice();
        assertEquals(new BigDecimal(15), thePrice);
        assertEquals("Mozzarella + prosciutto", theOrder.getAdds());
    }

    @Test
    public void testPizzaCapricciosaDoubleCheese() {
        OrderPizza theOrder = new PizzaMargeritaBasic();
        theOrder = new PizzaCapricciosaDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);

        BigDecimal thePrice = theOrder.getPrice();

        assertEquals(new BigDecimal(23), theOrder.getPrice());
        assertEquals("2x Mozzarella + ham + mushrooms", theOrder.getAdds());

    }
}
