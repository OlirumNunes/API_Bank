package com.banking.project.banking_app.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//public class AccountDto {
//
//    private Long id;
//    private String accountHolderName;
//    private double balance;
//}

/**
 * Represents a Data Transfer Object (DTO) for an account.
 * This record holds essential information about an account.
 */

public record AccountDto(Long id,
                         String accountHolderName,
                         double balance) {
}