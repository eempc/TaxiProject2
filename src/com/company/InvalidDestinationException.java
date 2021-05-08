package com.company;

public class InvalidDestinationException extends RuntimeException {
    public InvalidDestinationException(String errorMessage) {
        super(errorMessage);
    }
}
