package br.com.glandata.models;

import br.com.glandata.TipoAnimal;

public class Animal {
	
	private String nome;
	private TipoAnimal tipoAnimal;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}
	
	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", tipoAnimal=" + tipoAnimal + "]";
	}
	
	

}
