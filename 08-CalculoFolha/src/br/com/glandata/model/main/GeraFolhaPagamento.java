package br.com.glandata.model.main;

import br.com.glandata.model.FolhaPagamento;

public class GeraFolhaPagamento {

	public static void main(String[] args) {
	 	
		FolhaPagamento folhagian = new FolhaPagamento();
		folhagian.setDiastrabalhados(30);
		folhagian.setFaltas(2);
		folhagian.setSalariodia(580);
		
		
		FolhaPagamento folhaalessandra = new FolhaPagamento();
		folhaalessandra.setDiastrabalhados(30);
		folhaalessandra.setFaltas(2);
		folhaalessandra.setSalariodia(580);
		
		System.out.println(folhaalessandra);
		
		/*
		FolhaPagamento f = new FolhaPagamento();
		float salario f.getSalariodia() * f.getDiastrabalhados();
		System.out.println(salario);
		*/
	}

}
