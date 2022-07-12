package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;

public class Pessoa {

	public Pessoa() {
		System.out.println("Classe vindo Pessoa");
	}
	
	@Getter @Setter
	private int idade;

	@Getter @Setter
	private String endereco;
}
