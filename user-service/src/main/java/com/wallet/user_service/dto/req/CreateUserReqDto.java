package com.wallet.user_service.dto.req;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
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
public class CreateUserReqDto {
	
	@NotBlank(message = "Full name is required")
    private String fullName;

	@Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
	private String email;
	
	@NotEmpty
	private String mobileNumber;
	
	@NotBlank
	@Length(max = 20, min = 5, message = "Password must be at least 8 characters")
	private String password;

	@NotBlank
	private String address;
}
