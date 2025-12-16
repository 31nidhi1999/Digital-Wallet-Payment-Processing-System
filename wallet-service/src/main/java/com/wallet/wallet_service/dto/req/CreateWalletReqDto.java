package com.wallet.wallet_service.dto.req;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateWalletReqDto {
	
	@NotNull(message = "User ID is required")
	private Long userId;
}
