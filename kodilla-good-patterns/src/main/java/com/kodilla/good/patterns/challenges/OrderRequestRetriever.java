package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retriever() {
        User user = new User("Jan", "Kowalski");

        Product product = new Product("Komputer", 001, 1000.00);

        return new OrderRequest(user, product);
    }

}
