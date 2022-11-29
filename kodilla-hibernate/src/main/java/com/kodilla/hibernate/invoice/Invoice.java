package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {

    private int id;
    private String number;
    private List<Item> items;

    public Invoice() {

    }

    public Invoice(String number) {
        this.number = number;
        this.items = new ArrayList<>();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

//    @OneToOne(targetEntity = Product.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public String getNumber() {
        return number;
    }

    @OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
