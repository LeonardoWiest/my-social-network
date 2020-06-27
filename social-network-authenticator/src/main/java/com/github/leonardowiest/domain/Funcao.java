package com.github.leonardowiest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcao {

	public final static Funcao USER = new Funcao("USER");

	public final static Funcao SERVICE = new Funcao("SERVICE");

	private String descricao;
}
