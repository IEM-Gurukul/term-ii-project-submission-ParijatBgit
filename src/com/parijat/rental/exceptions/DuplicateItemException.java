package com.parijat.rental.exceptions;
public class DuplicateItemException extends Exception{ //if adding an item that already exists
    public DuplicateItemException(String message){
        super(message);
    }
}