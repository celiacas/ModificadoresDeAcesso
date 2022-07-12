package br.com.glandata.model.main;

import br.com.glandata.model.Colaborador;
import br.com.glandata.model.FolhaPagamento;

public class GeraFolha {

	public static void main(String[] args) {
		Colaborador colaborador = new Colaborador(10, "Celia");
		
		FolhaPagamento  folha = new FolhaPagamento(colaborador);
		folha.setDiastrabalhados(30);
		
		
		

	}

}
