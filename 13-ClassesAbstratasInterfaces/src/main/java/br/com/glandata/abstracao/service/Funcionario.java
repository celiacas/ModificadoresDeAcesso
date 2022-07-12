package br.com.glandata.abstracao.service;

import lombok.Getter;
import lombok.Setter;

public abstract class Funcionario {
	
	@Getter @Setter
    private	double salario;
	
	abstract double calculahoras();
	
	public double  getBnificacao() {
		return this.salario*0.10;
		
	}
	
	

}
