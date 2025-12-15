package com.wallet.user_service.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wallet.user_service.dto.req.CreateUserReqDto;
import com.wallet.user_service.dto.req.UpdateUserReqDto;
import com.wallet.user_service.dto.res.UserResponse;
import com.wallet.user_service.entity.User;
import com.wallet.user_service.service.UserService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private UserResponse userResponse;

	@Override
	public Optional<User> getUserById(Long userId) {
		
		return Optional.empty();
	}

	@Override
	public UserResponse createUser(CreateUserReqDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponse updateUser(UpdateUserReqDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
