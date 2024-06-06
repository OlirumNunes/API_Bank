package com.banking.project.banking_app.repository;

import com.banking.project.banking_app.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository interface for the Transaction entity.
 * This interface extends JpaRepository to provide basic CRUD operations for Transaction entities.
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    /**
     * Finds transactions by account ID and orders them by timestamp in descending order.
     *
     * @param accountId The ID of the account associated with the transactions.
     * @return A list of transactions belonging to the specified account, ordered by timestamp in descending order.
     */
    List<Transaction> findByAccountIdOrderByTimestampDesc(Long accountId);
}