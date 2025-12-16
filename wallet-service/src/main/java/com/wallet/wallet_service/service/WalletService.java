package com.wallet.wallet_service.service;

import com.wallet.wallet_service.dto.req.CreateWalletReqDto;
import com.wallet.wallet_service.dto.res.WalletResponseDto;

public interface WalletService {
	WalletResponseDto createWallet(CreateWalletReqDto dto);
	WalletResponseDto getWalletByUserId(Long userId);
}
