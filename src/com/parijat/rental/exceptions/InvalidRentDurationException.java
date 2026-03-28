package com.parijat.rental.exceptions;
public class InvalidRentDurationException extends Exception{ //when rental days are negative or invalid
    public InvalidRentDurationException(String message){
        super(message);
    }
}