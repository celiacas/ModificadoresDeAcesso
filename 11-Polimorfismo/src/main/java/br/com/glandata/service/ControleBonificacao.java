package br.com.glandata.service;

import br.com.glandata.polimorfismo.model.Funcionarios;
import lombok.Getter;

public class ControleBonificacao {
	
	@Getter
	private double soma;
	
	public void registra(Funcionarios f) {
	  double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	
	//Métodos não mais necessários por conta do
	//polimorfismo da classe funcionário
	/*
	public void registra(Gerente g) {
		double boni = g.getBonificacao();
		this.soma = this.soma + boni;	
	}
	
	public void registra(EditorVideo e) {
		double boni = e.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public void registra(Designer d) {
		double boni = d.getBonificacao();
		this.soma = this.soma + boni;
	}
	*/
		
}
