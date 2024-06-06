package com.banking.project.banking_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents an entity class for an account.
 * This class maps to the "accounts" table in the database.
 */
@Entity
@Table(name = "accounts")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // The unique identifier of the account.
    @Column(name = "account_holder_name")
    private String accountHolderName; // The name of the account holder.
    private double balance; // The current balance of the account.
}
