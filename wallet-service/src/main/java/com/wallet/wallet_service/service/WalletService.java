package com.wallet.wallet_service.service;

import java.math.BigDecimal;

import com.wallet.wallet_service.dto.req.CreateWalletReqDto;
import com.wallet.wallet_service.dto.res.ApiResponse;
import com.wallet.wallet_service.dto.res.WalletResponseDto;

public interface WalletService {
	ApiResponse createWallet(CreateWalletReqDto dto);
	WalletResponseDto getWalletByUserId(Long userId);
//	WalletResponseDto debitWallet(Long walletId, BigDecimal amount, String referenceId);
//	WalletResponseDto creditWallet(Long walletId, BigDecimal amount, String referenceId);
}
