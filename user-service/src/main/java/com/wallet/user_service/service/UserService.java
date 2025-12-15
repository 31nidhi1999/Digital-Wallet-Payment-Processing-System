package com.wallet.user_service.service;

import java.util.Optional;

import com.wallet.user_service.dto.req.CreateUserReqDto;
import com.wallet.user_service.dto.req.UpdateUserReqDto;
import com.wallet.user_service.dto.res.UserResponse;
import com.wallet.user_service.entity.User;

public interface UserService {
	
	Optional<User> getUserById(Long userId);
	UserResponse createUser(CreateUserReqDto dto);
	UserResponse updateUser(UpdateUserReqDto dto);
}
