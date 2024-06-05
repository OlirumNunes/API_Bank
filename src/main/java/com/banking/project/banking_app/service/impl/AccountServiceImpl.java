package com.banking.project.banking_app.service.impl;

import com.banking.project.banking_app.dto.AccountDto;
import com.banking.project.banking_app.dto.TransferFundDto;
import com.banking.project.banking_app.entity.Account;
import com.banking.project.banking_app.entity.Transaction;
import com.banking.project.banking_app.exception.AccountException;
import com.banking.project.banking_app.mapper.AccountMapper;
import com.banking.project.banking_app.repository.AccountRepository;
import com.banking.project.banking_app.repository.TransactionRepository;
import com.banking.project.banking_app.service.AccountService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private static final String UNDEFINED_ACCOUNT = "Account does not exists";
    private static final String TRANSACTION_TYPE_DEPOSIT = "DEPOSIT";
    private static final String TRANSACTION_TYPE_WITHDRAW = "WITHDRAW";
    private static final String TRANSACTION_TYPE_TRANFER = "TRANFER";

    static Transaction transaction = new Transaction();

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    public AccountServiceImpl(AccountRepository accountRepository,
                              TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    @Async
    public void saveTransaction(Account account,
                                Transaction transaction) {
        accountRepository.save(account);
        transactionRepository.save(transaction);
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository
                .findById(id)
                .orElseThrow(() -> new AccountException(UNDEFINED_ACCOUNT));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account = accountRepository
                .findById(id)
                .orElseThrow(() -> new AccountException(UNDEFINED_ACCOUNT));
        double total = account.getBalance() + amount;
        account.setBalance(total);

        transaction.setAccountId(id);
        transaction.setAmount(amount);
        transaction.setTransactionType(TRANSACTION_TYPE_DEPOSIT);
        transaction.setTimestamp(LocalDateTime.now());

        saveTransaction(account, transaction);

        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account = accountRepository
                .findById(id)
                .orElseThrow(() -> new AccountException(UNDEFINED_ACCOUNT));
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        double total = account.getBalance() - amount;
        account.setBalance(total);

        transaction.setAccountId(id);
        transaction.setAmount(amount);
        transaction.setTransactionType(TRANSACTION_TYPE_WITHDRAW);
        transaction.setTimestamp(LocalDateTime.now());

        saveTransaction(account, transaction);

        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map(AccountMapper::mapToAccountDto).toList();
    }

    @Override
    public void deleteAccount(Long id) {
        Account account = accountRepository
                .findById(id)
                .orElseThrow(() -> new AccountException(UNDEFINED_ACCOUNT));
        accountRepository.deleteById(id);
    }

    @Override
    public void transferFunds(TransferFundDto transferFundDto) {
        Account fromAccount = accountRepository
                .findById(transferFundDto.fromAccountId())
                .orElseThrow(() -> new AccountException(UNDEFINED_ACCOUNT));

        Account toAccount = accountRepository
                .findById(transferFundDto.toAccountId())
                .orElseThrow(() -> new AccountException(UNDEFINED_ACCOUNT));

        if (transferFundDto.amount() > fromAccount.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
            fromAccount.setBalance(fromAccount.getBalance() - transferFundDto.amount());
            toAccount.setBalance(toAccount.getBalance() + transferFundDto.amount());

            transaction.setAccountId(transferFundDto.fromAccountId());
            transaction.setAmount(transferFundDto.amount());
            transaction.setTransactionType(TRANSACTION_TYPE_TRANFER);
            transaction.setTimestamp(LocalDateTime.now());

            accountRepository.save(fromAccount);
            accountRepository.save(toAccount);
            transactionRepository.save(transaction);
        }
    }
}
