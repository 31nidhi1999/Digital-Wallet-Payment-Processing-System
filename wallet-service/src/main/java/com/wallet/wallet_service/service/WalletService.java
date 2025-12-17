package com.wallet.wallet_service.service;

import com.wallet.wallet_service.dto.req.CreateWalletReqDto;
import com.wallet.wallet_service.dto.res.ApiResponse;
import com.wallet.wallet_service.dto.res.WalletResponseDto;

public interface WalletService {
	ApiResponse createWallet(CreateWalletReqDto dto);
	WalletResponseDto getWalletByUserId(Long userId);
}
