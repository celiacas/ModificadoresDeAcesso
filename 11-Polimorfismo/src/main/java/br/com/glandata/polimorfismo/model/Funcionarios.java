package br.com.glandata.polimorfismo.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionarios {
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private double salario;
	

	public double getBonificacao() {		
	    return this.salario * 0.15;
	
	}


}
