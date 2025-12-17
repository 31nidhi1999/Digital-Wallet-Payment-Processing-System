package com.wallet.wallet_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.wallet_service.dto.req.CreateWalletReqDto;
import com.wallet.wallet_service.dto.res.ApiResponse;
import com.wallet.wallet_service.dto.res.WalletResponseDto;
import com.wallet.wallet_service.service.WalletService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/wallets")
@AllArgsConstructor
public class WalletController {

	private WalletService walletService;
	
	@PostMapping
	public ResponseEntity<ApiResponse> createWallet(@Valid @RequestBody CreateWalletReqDto dto){
		return  ResponseEntity.ok(walletService.createWallet(dto));
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<WalletResponseDto> getWalletByUserId(@PathVariable Long userId){
		return ResponseEntity.ok(walletService.getWalletByUserId(userId));
	}
}
