package com.parijat.rental.model;

public class rentTransaction {
    private String trnscId;
    private rentableItems item;
    private int days;
    private double totalCost;

    public rentTransaction(String trnscId, rentableItems item, int days) {
        this.trnscId = trnscId;
        this.item = item;
        this.days = days;
        this.totalCost = item.calculateRentalCost(days); //method behaves differently depending on the object as item can be room, accessories, fourwheeler, twowheeler
    }
    public String getTrnscId() {
        return trnscId;
    }
    public rentableItems getItem() {
        return item;
    }
    public int Days() {
        return days;
    }
    public double TotalCost() {
        return totalCost;
    }
}