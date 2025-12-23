package com.wallet.transaction_service.dto;

import java.math.BigDecimal;

import org.springframework.data.web.JsonPath;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDTO {
	
		private Long id;

	    @NotNull
	    private Long senderWalletId;

	    @NotNull
	    private Long receiverWalletId;

	    @DecimalMin(value = "0.1", message = "Amount must be greater than zero")
	    private BigDecimal amount;

	    private String status;
}
