package com.wallet.transaction_service.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wallet.transaction_service.dto.TransactionDTO;
import com.wallet.transaction_service.entity.Transaction;
import com.wallet.transaction_service.entity.TransactionStatus;
import com.wallet.transaction_service.repository.TransactionRepo;
import com.wallet.transaction_service.service.TransactionService;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {
	
	private TransactionRepo transactionRepo;
	private ModelMapper modelMapper;
	
	@Override
	public TransactionDTO createTransaction(TransactionDTO dto) {
		Transaction transaction = modelMapper.map(dto, Transaction.class);
		transaction.setStatus(TransactionStatus.SUCCESS);
		return modelMapper.map(transactionRepo.save(transaction), TransactionDTO.class);
	}

}
