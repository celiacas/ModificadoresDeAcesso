package br.com.glandata.model;

import lombok.Getter;

public class Colaborador {
	
	@Getter
	private String nome;
	
	@Getter 
	private Integer nomerogistro;

	public Colaborador(Integer nomerogistro, String nome) {
		
		this.nomerogistro = nomerogistro;
		this.nome = nome;
		
	}
	

}
