package com.banking.project.banking_app.mapper;

import com.banking.project.banking_app.dto.AccountDto;
import com.banking.project.banking_app.entity.Account;

/**
 * Mapper class responsible for mapping Account and AccountDto objects to each other.
 * This class provides static methods for mapping an AccountDto to an Account and vice versa.
 */
public class AccountMapper {

    /**
     * Maps an AccountDto object to an Account object.
     *
     * @param accountDto The AccountDto object to be mapped.
     * @return The mapped Account object.
     */
    public static Account mapToAccount(AccountDto accountDto) {
        return new Account(
                accountDto.id(), // Set the ID of the account.
                accountDto.accountHolderName(), // Set the account holder name.
                accountDto.balance() // Set the balance of the account.
        );
    }

    /**
     * Maps an Account object to an AccountDto object.
     *
     * @param account The Account object to be mapped.
     * @return The mapped AccountDto object.
     */
    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
                account.getId(), // Set the ID of the account.
                account.getAccountHolderName(), // Set the account holder name.
                account.getBalance() // Set the balance of the account.
        );
    }
}