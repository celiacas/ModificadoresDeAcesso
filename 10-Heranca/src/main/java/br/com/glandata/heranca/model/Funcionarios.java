package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionarios extends Pessoa {
	
	
	public Funcionarios(int registro, String nome) {
		this.registro = registro;
		this.nome = nome;
	}


	@Getter  @Setter
	private int registro;
	
	@Getter  @Setter
	private String nome;
	
	@Getter @Setter
	private float salario;
	
	public void imprimenomefuncionario() {
		System.out.println(this.nome);
	}
	
	

}
