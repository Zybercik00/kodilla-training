package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item {

    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;
    private List<Product> products = new ArrayList<>();

    public Item() {

    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
        this.products = new ArrayList<>();
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

//
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Product> getProducts() {
        return products;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
