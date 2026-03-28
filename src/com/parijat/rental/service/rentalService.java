package com.parijat.rental.service;
import com.parijat.rental.model.*;
import com.parijat.rental.exceptions.*;
import java.util.*;

public class rentalService{
    private Map<String, rentableItems> items = new HashMap<>();
    private Map<String, customer> customers = new HashMap<>();
    private Map<String, rentTransaction> activeRentals = new HashMap<>();
    public void addItem(rentableItems item) throws DuplicateItemException{
        if (items.containsKey(item.getItemId())){
            throw new DuplicateItemException("Item already exists!");
        }
        items.put(item.getItemId(), item);
    }
    public void registerCustomer(customer customer) throws DuplicateCustomerException{
        if (customers.containsKey(customer.getId())){
            throw new DuplicateCustomerException("Customer already exists!");
        }
        customers.put(customer.getId(), customer);
    }
    public void rentItem(String transactionId, String customerId, String itemId, int days)
            throws CustomerNotFoundException, ItemNotFoundException,
                   ItemNotAvailableException, InvalidRentDurationException{
        if (days<=0) {
            throw new InvalidRentDurationException("Days must be greater than zero");
        }
        if (!customers.containsKey(customerId)) {
            throw new CustomerNotFoundException("Customer not found");
        }
        if (!items.containsKey(itemId)) {
            throw new ItemNotFoundException("Item not found");
        }
        rentableItems item =items.get(itemId);
        if (!item.isAvailable()) {
            throw new ItemNotAvailableException("Item is not available");
        }
        rentTransaction transaction =new rentTransaction(transactionId, item, days);
        item.markAsRented();
        activeRentals.put(transactionId, transaction);
        customer customer =customers.get(customerId);
        customer.addTransaction(transaction);
    }
    public void returnItem(String transactionId) throws InvalidReturnException{
        if (!activeRentals.containsKey(transactionId)){
            throw new InvalidReturnException("Invalid return: transaction not found");
        }
        rentTransaction transaction = activeRentals.get(transactionId);
        transaction.getItem().markAsReturned();
        activeRentals.remove(transactionId);
    }
    public void displayItems(){
        for (rentableItems item : items.values()){
            String check;
            if (item.isAvailable()){
                check = "Yes";
            }else{
                check = "No";
            }
            System.out.println("Item ID: " + item.getItemId() + "\nAvailable ? : " + check);
        }
    }
}