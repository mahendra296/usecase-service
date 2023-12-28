package com.usecase.exceptions;

public class AuthorizationException extends RuntimeException {

    public String message;

    public AuthorizationException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
