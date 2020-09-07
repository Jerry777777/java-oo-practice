package com.twu.exceptiond;

public class VoteFailException extends RuntimeException {
    public VoteFailException(String message) {
        super(message);
    }
}