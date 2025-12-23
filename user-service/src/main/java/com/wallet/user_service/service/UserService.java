package com.wallet.user_service.service;

import java.util.Optional;

import com.wallet.user_service.dto.UserDto;
import com.wallet.user_service.entity.User;

public interface UserService {
	
	UserDto getUserById(Long userId);
	UserDto createUser(UserDto dto);
}
