package com.parijat.rental.exceptions;
public class CustomerNotFoundException extends Exception{ //if customer id doesnt exist
    public CustomerNotFoundException(String message){
        super(message);
    }
}