package com.parijat.rental.model;
public class Accessories extends rentableItems {
    public Accessories(String itemId, double baseRate) {
        super(itemId, baseRate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRate()*days*0.8; //only 80% of the total rate is charged, i.e 20% discount
    }
}