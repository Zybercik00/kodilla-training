package com.kodilla.good.patterns.challenges.food2door;

public class InformationSerivce {

    public void inform(Order order, String shopName, boolean status) {
        System.out.println("Zamowienie " + order + "ze sklepu: " + shopName + " status zamowienia: " + (status ? "zrealizowana" : "nie zrealizowane"));
    }
}
