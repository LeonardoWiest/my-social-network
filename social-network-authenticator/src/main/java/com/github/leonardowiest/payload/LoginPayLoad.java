package com.github.leonardowiest.payload;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginPayLoad {

	@NotBlank
	private String usuario;

	@NotBlank
	private String senha;
}
