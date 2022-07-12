package br.com.glandata.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Table(name="clientes")
public class Cliente {
	
	public Cliente() {
	}
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	@Getter @Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Getter @Setter
	@Column(length = 50)
	@NotBlank(message = "O nome do cliente não pode ser vazio")
	private String nome;
	
	@Getter @Setter
	@CPF(message = "Informe um CPF válido")
	@NotBlank(message = "CPF não pode ser vazio")
	private String cpf;
	
	@Getter @Setter
	//@Pattern(regexp = "^(.+)@(.+)$", message = "E-mail inválido") // regexp pode validar cpf
	@Email
	private String email;
	
}
