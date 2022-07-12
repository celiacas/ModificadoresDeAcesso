package br.com.glandata.abstracao.service;

public class Gerente extends Funcionario {

	@Override
	public double calculahoras() {
		return 0;
	}
	
	public void testametodo() {
		System.out.println("Olá Gerente");
	}

}
