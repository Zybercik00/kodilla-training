package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
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
    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
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
