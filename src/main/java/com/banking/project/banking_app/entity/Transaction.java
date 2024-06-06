package com.banking.project.banking_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Represents an entity class for a transaction.
 * This class maps to the "transactions" table in the database.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // The unique identifier of the transaction.
    private Long accountId; // The ID of the account associated with the transaction.
    private double amount; // The amount involved in the transaction.
    private String transactionType; // The type of transaction (e.g., deposit, withdrawal, transfer).
    private LocalDateTime timestamp; // The timestamp indicating when the transaction occurred.
}