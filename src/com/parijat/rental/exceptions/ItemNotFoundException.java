package com.parijat.rental.exceptions;
public class ItemNotFoundException extends Exception{ //if id of any item doesnt exist(i.e the item doesnt exist)
    public ItemNotFoundException(String message){
        super(message);
    }
}