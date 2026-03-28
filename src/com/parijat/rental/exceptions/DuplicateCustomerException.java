package com.parijat.rental.exceptions;
public class DuplicateCustomerException extends Exception{ //if registering a customer who already exists
    public DuplicateCustomerException(String message){
        super(message);
    }
}