package com.wallet.user_service.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.wallet.user_service.dto.req.CreateUserReqDto;
import com.wallet.user_service.dto.req.UpdateUserReqDto;
import com.wallet.user_service.dto.res.UserResponse;
import com.wallet.user_service.entity.User;
import com.wallet.user_service.exception.ResourceNotFoundException;
import com.wallet.user_service.exception.UserAlreadyExistsException;
import com.wallet.user_service.repository.UserRepository;
import com.wallet.user_service.service.UserService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private ModelMapper modelMapper;

	@Override
	public UserResponse getUserById(Long userId) {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User with ID " + userId + " not found !!!!"));
		return modelMapper.map(user, UserResponse.class);
	}

	@Override
	public UserResponse createUser(CreateUserReqDto dto) {
		if(userRepository.existsByEmail(dto.getEmail())) 
			throw new UserAlreadyExistsException("User with same email already exists !!!");
		User user = modelMapper.map(dto, User.class);
		return modelMapper.map(userRepository.save(user),UserResponse.class);
	}

	@Override
	public UserResponse updateUser(Long userId,UpdateUserReqDto dto) {
		User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not found"));
		modelMapper.map(dto, user);
		return modelMapper.map(userRepository.save(user),UserResponse.class);
	}

}
