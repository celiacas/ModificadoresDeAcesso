package br.com.glandata.polimorfismo.model;

import lombok.Getter;
import lombok.Setter;

public class Gerente extends Funcionarios {

	private int senha = 123456;

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getBonificacao() + super.getSalario();
		//5000.00*0.15 + 5000.00
	}
	
	public Boolean autentica(int senha) {

		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}

}
