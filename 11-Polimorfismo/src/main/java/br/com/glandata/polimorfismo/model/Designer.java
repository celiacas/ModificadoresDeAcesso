package br.com.glandata.polimorfismo.model;

public class Designer extends Funcionarios {
	
	@Override
	public double getBonificacao() {
		System.out.println(" Chamado o método de bonificação do designer");
		return 300;
	}

}
