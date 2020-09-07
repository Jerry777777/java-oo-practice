package com.twu.exceptiond;

public class WrongInputException extends RuntimeException{
    public WrongInputException(String message) {
        super(message);
    }
}
