package com.lti.finance.exception;

public class UsersException extends Exception
{
    public UsersException(String message) {
        super(message);
    }

    public UsersException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsersException(Throwable cause) {
        super(cause);
    }
}
