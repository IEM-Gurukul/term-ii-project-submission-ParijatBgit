package com.parijat.rental.model;

public class FourWheeler extends rentableItems {
    public FourWheeler(String itemId, double baseRate) {
        super(itemId, baseRate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRate()*days+150; //150 fixed maintanance cost for four wheeler
    }
}