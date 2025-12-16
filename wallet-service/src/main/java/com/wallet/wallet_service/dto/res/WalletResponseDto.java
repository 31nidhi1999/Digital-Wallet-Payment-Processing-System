package com.wallet.wallet_service.dto.res;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class WalletResponseDto {
	private Long walletId;
    private Long userId;
    private BigDecimal balance;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
}
