package com.parijat.rental.model;

public class TwoWheeler extends rentableItems {
    public TwoWheeler(String itemId, double baseRate) {
        super(itemId, baseRate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRate() *days+50; //Maintanance cost(fixed)
    }
}