package br.com.glandata.main;

import br.com.glandata.model.Colaborador;
import br.com.glandata.model.FolhaPagamento;

public class TestaFolha {

	public static void main(String[] args) {
		
		Colaborador colaborador = new Colaborador(12345, "Ailton");
		FolhaPagamento folha = new FolhaPagamento(colaborador);
		
		folha.setDiastrabalhados(31);
		folha.setFaltas(3);
		folha.setSalariodia(47.5f);
		
		System.out.println("O salário do colaborador " + folha.getColaborador().getNome() + "é " + folha.salario());
		

	}

}
