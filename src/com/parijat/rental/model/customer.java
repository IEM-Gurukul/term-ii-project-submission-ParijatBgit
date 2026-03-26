package com.parijat.rental.model;
import java.util.ArrayList;
import java.util.List;

public class customer {
    private String Id;
    private String name;
    private List<rentTransaction> rentalHistory; //to store all transaction made by customer.

    public customer(String Id, String name) {
        this.Id = Id;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }
    public String getId() {
        return Id;
    }
    public String getName() {
        return name;
    }
    public List<rentTransaction> rentalHistory() { //a copy of rental history is returned to maintain encapsulation, so that internal data is protected.
        return new ArrayList<>(rentalHistory);
    }
    public void addTransaction(rentTransaction trnsc) {
        rentalHistory.add(trnsc);
    }
}