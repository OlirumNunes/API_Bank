package com.banking.project.banking_app.exception;

/**
 * Represents an exception specific to account-related operations.
 * This exception is used to handle errors related to accounts.
 */
public class AccountException extends RuntimeException {

    /**
     * Constructs an AccountException with the specified detail message.
     *
     * @param message The detail message (which is saved for later retrieval by the getMessage() method).
     */
    public AccountException(String message) {
        super(message);
    }
}