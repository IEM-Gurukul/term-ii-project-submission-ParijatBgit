package com.parijat.rental.exceptions;
public class InvalidReturnException extends Exception{ //if returning an item that is not rented.
    public InvalidReturnException(String message){
        super(message);
    }
}