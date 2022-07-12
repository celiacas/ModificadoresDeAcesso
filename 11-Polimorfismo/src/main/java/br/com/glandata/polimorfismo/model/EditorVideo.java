package br.com.glandata.polimorfismo.model;

public class EditorVideo extends Funcionarios {
	
	@Override
	public double getBonificacao() {
		System.out.println(" Chamado o método de bonificação do editor de vídeos");
		return 200;
	}
	
}
