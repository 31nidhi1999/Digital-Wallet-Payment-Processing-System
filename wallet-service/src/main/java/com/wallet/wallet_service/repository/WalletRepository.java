package com.wallet.wallet_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.wallet_service.entity.WalletEntity;

@Repository
public interface WalletRepository extends JpaRepository<WalletEntity, Long>{
	Optional<WalletEntity> findByUserId(Long userId);
	boolean existsByUserId(Long userId);
}
