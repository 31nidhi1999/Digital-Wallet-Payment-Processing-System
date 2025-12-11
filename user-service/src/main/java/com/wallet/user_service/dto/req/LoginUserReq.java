package com.wallet.user_service.dto.req;

import org.hibernate.validator.constraints.Length;

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
public class LoginUserReq {
	
	@NotBlank
	private String email;
	
	@NotBlank
	@Length(max = 20, min = 5)
	private String password;
}
