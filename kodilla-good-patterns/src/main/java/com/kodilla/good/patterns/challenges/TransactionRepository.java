package com.kodilla.good.patterns.challenges;

public interface TransactionRepository {

    boolean createTransaction(User user, Product product);
}
