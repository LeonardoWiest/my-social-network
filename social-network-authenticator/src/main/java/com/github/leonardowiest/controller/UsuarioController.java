package com.github.leonardowiest.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.leonardowiest.payload.AutenticarPayLoad;

@RestController
public class UsuarioController {

	@PostMapping("/autenticar")
	public ResponseEntity<?> autenticar(@Valid @RequestBody AutenticarPayLoad autenticarPayLoad) {

		return ResponseEntity.ok(null);
	}
}
