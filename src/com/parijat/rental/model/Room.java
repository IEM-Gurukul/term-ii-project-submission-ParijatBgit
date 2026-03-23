package com.parijat.rental.model;
public class Room extends rentableItems {
    public Room(String itemId, double baseRate) {
        super(itemId, baseRate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRate()*days*1.5; //room service charge
    }
}
