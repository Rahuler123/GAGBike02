package com.user.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginRequestDto {
	@NotBlank
	private String email;

	@NotBlank
	private String password;

}
