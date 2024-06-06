package com.banking.project.banking_app.dto;

import java.time.LocalDateTime;

public record TransactionDto(Long id,
                             Long accountId,
                             double amount,
                             String transactionTyp,
                             LocalDateTime timestamp) {
}
