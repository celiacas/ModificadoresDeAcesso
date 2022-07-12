package br.com.glandata.abstracao.service;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Carro implements Veiculo {
	
	@Getter
	private String nome;
	
	@Override
	public String setNome(String nome) {
	this.nome = nome;
		return "OK";
	}

	@Override
	public void liga() {
		System.out.println("Ligou o carro");

	}

	@Override
	public int VelocidadeMaxima() {
		return 150;
	}

	@Override
	public void buzina() {
		System.out.println("Fom Fom");

	}

}
