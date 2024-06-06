package com.banking.project.banking_app.service;

import com.banking.project.banking_app.dto.AccountDto;
import com.banking.project.banking_app.dto.TransactionDto;
import com.banking.project.banking_app.dto.TransferFundDto;

import java.util.List;

/**
 * Service interface defining methods related to account management.
 * These methods provide functionality for creating, retrieving, updating, and deleting accounts,
 * depositing and withdrawing funds, transferring funds between accounts, and retrieving account transactions.
 */
public interface AccountService {

    /**
     * Creates a new account with the provided account information.
     *
     * @param accountDto The AccountDto object containing account information.
     * @return The created AccountDto object.
     */
    AccountDto createAccount(AccountDto accountDto);

    /**
     * Retrieves an account by its unique identifier.
     *
     * @param id The unique identifier of the account to retrieve.
     * @return The AccountDto object corresponding to the provided ID.
     */
    AccountDto getAccountById(Long id);

    /**
     * Deposits funds into the specified account.
     *
     * @param id     The unique identifier of the account to deposit funds into.
     * @param amount The amount of funds to deposit.
     * @return The updated AccountDto object after the deposit operation.
     */
    AccountDto deposit(Long id, double amount);

    /**
     * Withdraws funds from the specified account.
     *
     * @param id     The unique identifier of the account to withdraw funds from.
     * @param amount The amount of funds to withdraw.
     * @return The updated AccountDto object after the withdrawal operation.
     */
    AccountDto withdraw(Long id, double amount);

    /**
     * Retrieves all accounts.
     *
     * @return A list of all AccountDto objects representing accounts.
     */
    List<AccountDto> getAllAccounts();

    /**
     * Deletes the account with the specified unique identifier.
     *
     * @param id The unique identifier of the account to delete.
     */
    void deleteAccount(Long id);

    /**
     * Transfers funds between accounts.
     *
     * @param transferFundDto The TransferFundDto object containing transfer information.
     */
    void transferFunds(TransferFundDto transferFundDto);

    /**
     * Retrieves transactions associated with the specified account.
     *
     * @param accountId The unique identifier of the account.
     * @return A list of TransactionDto objects representing transactions associated with the account.
     */
    List<TransactionDto> getAccountTransactions(Long accountId);
}