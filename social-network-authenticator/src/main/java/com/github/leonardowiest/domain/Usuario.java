package com.github.leonardowiest.domain;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Usuario {

	public Usuario(Usuario usuario) {

	}

	public Usuario(String usuario, String senha, String email) {
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
		this.ativo = true;
		this.funcoes = new HashSet<>() {

			private static final long serialVersionUID = 1L;

			{
				new Funcao("USER");
			}
		};
	}

	@Id
	private String id;

	@NotBlank
	@Size(max = 15)
	private String usuario;

	@NotBlank
	@Size(max = 100)
	@JsonIgnore
	private String senha;

	@NotBlank
	@Size(max = 40)
	@Email
	private String email;

	@CreatedDate
	private Instant dataCadastro;

	@LastModifiedDate
	private Instant dataManutencacao;

	private boolean ativo;

	private Perfil perfil;

	private Set<Funcao> funcoes;

}
