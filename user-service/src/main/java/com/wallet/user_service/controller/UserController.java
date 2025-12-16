package com.wallet.user_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.user_service.dto.req.CreateUserReqDto;
import com.wallet.user_service.dto.req.UpdateUserReqDto;
import com.wallet.user_service.dto.res.UserResponse;
import com.wallet.user_service.service.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
	
	private UserService userService;
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserResponse> getUserById(@PathVariable Long userId){
		return ResponseEntity.ok(userService.getUserById(userId));
	}
	
	@PostMapping("/create")
	public ResponseEntity<UserResponse> createUser(@Valid @RequestBody CreateUserReqDto dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(dto));
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserResponse> updateUser(@PathVariable Long userId,@Valid @RequestBody UpdateUserReqDto dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.updateUser(userId, dto));
	}
}
