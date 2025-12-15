package com.wallet.user_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.user_service.dto.req.CreateUserReqDto;
import com.wallet.user_service.dto.req.UpdateUserReqDto;
import com.wallet.user_service.dto.res.UserResponse;
import com.wallet.user_service.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	private UserService userService;
	
	public ResponseEntity<UserResponse> getUserById(){
		return null;
	}
	
	public ResponseEntity<UserResponse> createUser(@Valid @RequestBody CreateUserReqDto dto){
		return null;
	}
	
	public ResponseEntity<UserResponse> updateUser(@Valid @RequestBody UpdateUserReqDto dto){
		return null;
	}
}
