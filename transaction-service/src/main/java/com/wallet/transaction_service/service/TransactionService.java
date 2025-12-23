package com.wallet.transaction_service.service;

import org.springframework.stereotype.Service;

import com.wallet.transaction_service.dto.TransactionDTO;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface TransactionService {
	TransactionDTO createTransaction(TransactionDTO dto);
}
