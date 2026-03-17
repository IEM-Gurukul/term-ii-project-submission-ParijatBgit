package com.parijat.rental.model;

public abstract class rentableItems {
    private String itemId;
    private double baseRate;
    private boolean available;

    public rentableItems(String itemId, double baseRate) {
        this.itemId = itemId;
        this.baseRate = baseRate;
        this.available = true;
    }
    public String getItemId() {
        return itemId;
    }
    public double getBaseRate() {
        return baseRate;
    }
    public boolean isAvailable() {
        return available;
    }
    protected void setAvailability(boolean status) {
        this.available = status;
    }
    public abstract double calculateRentalCost(int days);
}
