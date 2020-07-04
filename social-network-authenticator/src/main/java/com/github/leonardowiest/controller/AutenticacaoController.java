package com.github.leonardowiest.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.leonardowiest.payload.LoginPayLoad;

@RestController
public class AutenticacaoController {

	@PostMapping("/login")
	public ResponseEntity<?> realizarLogin(@Valid @RequestBody LoginPayLoad autenticarPayLoad) {

		System.out.println("Entrou...");

		return ResponseEntity.ok(null);
	}
}
