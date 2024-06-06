package com.banking.project.banking_app.dto;

/**
 * Represents a Data Transfer Object (DTO) for transferring funds between accounts.
 * This record holds essential information required for fund transfer.
 */
public record TransferFundDto(
        Long fromAccountId, // The ID of the account from which funds are transferred.
        Long toAccountId, // The ID of the account to which funds are transferred.
        double amount // The amount of funds to be transferred.
) {
}
