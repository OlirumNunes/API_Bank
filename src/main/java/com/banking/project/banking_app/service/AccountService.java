package com.banking.project.banking_app.service;

import com.banking.project.banking_app.dto.AccountDto;
import com.banking.project.banking_app.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);
}
