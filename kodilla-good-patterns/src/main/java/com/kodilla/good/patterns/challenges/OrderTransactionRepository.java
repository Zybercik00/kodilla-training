package com.kodilla.good.patterns.challenges;

public class OrderTransactionRepository implements TransactionRepository{

    @Override
    public boolean createTransaction(User user, Product product) {
        return true;
    }
}
