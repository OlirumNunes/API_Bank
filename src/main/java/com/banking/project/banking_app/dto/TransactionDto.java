package com.banking.project.banking_app.dto;

import java.time.LocalDateTime;

/**
 * Represents a Data Transfer Object (DTO) for a transaction.
 * This record holds information about a transaction.
 */
public record TransactionDto(
        Long id, // The unique identifier of the transaction.
        Long accountId, // The ID of the account associated with the transaction.
        double amount, // The amount involved in the transaction.
        String transactionType, // The type of transaction (e.g., deposit, withdrawal).
        LocalDateTime timestamp // The timestamp indicating when the transaction occurred.
) {
}
