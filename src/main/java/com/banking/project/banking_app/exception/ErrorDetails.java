package com.banking.project.banking_app.exception;

import java.time.LocalDateTime;

/**
 * Represents a record for storing error details.
 * This record contains information about an error, including timestamp, message, details, and error code.
 */
public record ErrorDetails(
        LocalDateTime timestamp, // The timestamp when the error occurred.
        String message, // A brief message describing the error.
        String details, // Additional details or context about the error.
        String errorCode // An error code associated with the error.
) {
}