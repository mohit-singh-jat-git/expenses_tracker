package com.example.expenseTracker.exception;

public class OurException extends RuntimeException{
    public OurException(String message) {
        super(message);
    }

    public OurException(String message, Throwable cause) {
        super(message, cause);
    }

    public OurException(Throwable cause) {
        super(cause);
    }
}
