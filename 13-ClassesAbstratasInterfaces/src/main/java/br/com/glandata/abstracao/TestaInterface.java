package br.com.glandata.abstracao;

import br.com.glandata.abstracao.service.Carro;

public class TestaInterface {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setNome("Fusca");
		carro.buzina();
		carro.liga();
		carro.VelocidadeMaxima();
		
		System.out.println(carro);
		
		

	}

}
