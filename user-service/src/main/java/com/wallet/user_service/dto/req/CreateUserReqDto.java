package com.wallet.user_service.dto.req;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
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
	
	@NotBlank
    private String fullName;

	@NotBlank
	private String email;
	
	@NotEmpty
	private String mobileNumber;
	
	@NotBlank
	@Length(max = 20, min = 5)
	private String password;

	@NotBlank
	private String address;
}
