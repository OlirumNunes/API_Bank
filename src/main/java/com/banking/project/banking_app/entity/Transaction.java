package com.banking.project.banking_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long accountId;
    private double amount;
    private String transactionType; //Deposit, Withdraw, Transfer
    private LocalDateTime timestamp;
}
