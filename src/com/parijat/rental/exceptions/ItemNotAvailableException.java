package com.parijat.rental.exceptions;
public class ItemNotAvailableException extends Exception{ //if item is not available
    public ItemNotAvailableException(String message){
        super(message);
    }
}