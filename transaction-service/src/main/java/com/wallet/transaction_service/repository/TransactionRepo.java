package com.wallet.transaction_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.transaction_service.entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {

}
