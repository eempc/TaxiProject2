package com.company;

public class TargetLocationAlreadySetException extends RuntimeException {
    public TargetLocationAlreadySetException(String errorMsg) {
        super(errorMsg);
    }
}
