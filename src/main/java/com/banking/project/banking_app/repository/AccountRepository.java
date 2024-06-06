package com.banking.project.banking_app.repository;

import com.banking.project.banking_app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for the Account entity.
 * This interface extends JpaRepository to provide basic CRUD operations for Account entities.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
}