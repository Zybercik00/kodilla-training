package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Order {

    private String productType;
    private double quantity;

    public Order(String productType, double quantity) {
        this.productType = productType;
        this.quantity = quantity;
    }

    public String getProductType() {
        return productType;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.quantity, quantity) == 0 && Objects.equals(productType, order.productType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "productType='" + productType + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
