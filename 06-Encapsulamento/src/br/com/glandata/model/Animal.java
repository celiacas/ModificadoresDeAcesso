package br.com.glandata.model;

import java.util.Objects;

public class Animal {
	
	public Animal() {
		
	}
	
	public Animal(String tipo, String meiolocaomocao, String nome) {
		this.tipo = tipo;
		this.meiolocaomocao = meiolocaomocao;
		this.nome = nome;
	}

	
	public Animal(String tipo, String tipoalimentacao, String meiolocaomocao, Integer idademaxima, String nome) {
		super();
		this.tipo = tipo;
		this.tipoalimentacao = tipoalimentacao;
		this.meiolocaomocao = meiolocaomocao;
		this.idademaxima = idademaxima+5;
		this.nome = nome;
	}



	private String tipo;
	private String tipoalimentacao;
	private String meiolocaomocao;
	private Integer idademaxima;
	private String nome;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipoalimentacao() {
		return tipoalimentacao;
	}
	public void setTipoalimentacao(String tipoalimentacao) {
		this.tipoalimentacao = tipoalimentacao;
	}
	public String getMeiolocaomocao() {
		return meiolocaomocao;
	}
	public void setMeiolocaomocao(String meiolocaomocao) {
		this.meiolocaomocao = meiolocaomocao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idademaxima, meiolocaomocao, nome, tipo, tipoalimentacao);
	}

	public Integer getIdademaxima() {
		return idademaxima;
	}
	public void setIdademaxima(Integer idademaxima) {
		this.idademaxima = idademaxima;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Animal [tipo=" + tipo + ", tipoalimentacao=" + tipoalimentacao + ", meiolocaomocao=" + meiolocaomocao
				+ ", idademaxima=" + idademaxima + ", nome=" + nome + "]";

	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(idademaxima, other.idademaxima) && Objects.equals(meiolocaomocao, other.meiolocaomocao)
				&& Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo)
				&& Objects.equals(tipoalimentacao, other.tipoalimentacao);
	}
	
}
