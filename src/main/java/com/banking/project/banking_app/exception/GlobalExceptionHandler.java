package com.banking.project.banking_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

/**
 * Global exception handler for handling exceptions across all controllers.
 * This class provides methods to handle specific exceptions and generic exceptions.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles AccountException and returns an appropriate ResponseEntity with error details.
     *
     * @param exception  The AccountException instance.
     * @param webRequest The WebRequest instance.
     * @return A ResponseEntity containing error details and HttpStatus.NOT_FOUND.
     */
    @ExceptionHandler(AccountException.class)
    public ResponseEntity<ErrorDetails> handlerAccountException(AccountException exception,
                                                                WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false),
                "ACCOUNT_NOT_FOUND"
        );
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    /**
     * Handles generic exceptions and returns an appropriate ResponseEntity with error details.
     *
     * @param exception  The Exception instance.
     * @param webRequest The WebRequest instance.
     * @return A ResponseEntity containing error details and HttpStatus.INTERNAL_SERVER_ERROR.
     */
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handleGenericException(Exception exception,
                                                               WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false),
                "INTERNAL_SERVER_ERROR"
        );
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}