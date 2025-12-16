package com.wallet.wallet_service.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.wallet.wallet_service.dto.req.CreateWalletReqDto;
import com.wallet.wallet_service.dto.res.WalletResponseDto;
import com.wallet.wallet_service.entity.WalletEntity;
import com.wallet.wallet_service.exception.WalletAlreadyExistsException;
import com.wallet.wallet_service.exception.WalletNotFoundException;
import com.wallet.wallet_service.repository.WalletRepository;
import com.wallet.wallet_service.service.WalletService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class WalletServiceImpl implements WalletService {

	private WalletRepository walletRepository;
	private ModelMapper modelMapper;
	
	@Override
	public WalletResponseDto createWallet(CreateWalletReqDto dto) {
		
		if(walletRepository.existsByUserId(dto.getUserId())) {
			throw new WalletAlreadyExistsException("Wallet already exists for this user");
		}
		WalletEntity wallet = modelMapper.map(dto,WalletEntity.class);
		return modelMapper.map(wallet, WalletResponseDto.class);
	}

	@Override
	public WalletResponseDto getWalletByUserId(Long userId) {
		
		WalletEntity wallet = walletRepository.findByUserId(userId)
				.orElseThrow(() -> new WalletNotFoundException("Wallet not found"));
		return modelMapper.map(wallet, WalletResponseDto.class);
	}

}
