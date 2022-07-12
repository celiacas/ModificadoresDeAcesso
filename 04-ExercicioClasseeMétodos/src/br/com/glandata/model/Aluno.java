package br.com.glandata.model;

public class Aluno {

	
	public String nome;
	public Float nota1;
	public Float nota2;
	public Float nota3;
	
	
	public Float calculamedia(){
		Float media = (this.nota1 +  this.nota2 +  this.nota3 / 3);
		return media;
	}
	
}