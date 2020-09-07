package com.twu;

public class VoteFailException extends RuntimeException {
    public VoteFailException(String message) {
        super(message);
    }
}