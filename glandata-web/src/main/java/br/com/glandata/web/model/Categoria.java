package br.com.glandata.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Table(name = "categorias")
public class Categoria {
	
	public Categoria() {
	}
	
	public Categoria(String nome) {
		this.nome = nome;
	}

	@Getter @Setter
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Getter @Setter
	@Column(length = 50)
	@NotBlank(message = "A descrição da categoria não pode ser vazia")
	private String nome;
	
}
