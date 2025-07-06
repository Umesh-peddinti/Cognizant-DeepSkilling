package com.example.exception;

public class ExceptionThrower {
    public void throwException(boolean shouldThrow) {
        if (shouldThrow) {
            throw new IllegalArgumentException("Exception was thrown as expected");
        }
    }
}
