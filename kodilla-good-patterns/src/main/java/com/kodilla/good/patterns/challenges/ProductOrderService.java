package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService{

    public boolean order(final User user, final Product product) {
        System.out.println("User: " + user.getName() + " have bought " + product.getName());

        return true;
    }

}
