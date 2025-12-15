package com.wallet.user_service.dto.res;

import org.hibernate.validator.constraints.Length;

import com.wallet.user_service.entity.UserStatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
	
	private Long id;

    private String fullName;

	private String email;
	
	private String mobileNumber;
	
	private String address;
	
	private UserStatus status;
}
