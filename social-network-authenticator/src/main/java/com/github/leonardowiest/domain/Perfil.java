package com.github.leonardowiest.domain;

import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Perfil {

	private String nomeExibicao;

	private String urlFoto;

	private Date dataAniversario;

	private Set<Endereco> enderecos;
}
