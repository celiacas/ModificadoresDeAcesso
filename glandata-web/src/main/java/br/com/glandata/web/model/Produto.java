package br.com.glandata.web.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity  
@Table(
		name = "produtos",  
		indexes = {@Index(name="id_produto", columnList = "id")}
		//uniqueConstraints = {@UniqueConstraint(name = "nome_unique", columnNames = "nome")}
		)  
public class Produto {
	
	public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	public Produto() {	
	}
	

	@Getter @Setter
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String descricao;
	
	@Getter @Setter
	private BigDecimal preco;
	
	@Getter @Setter
	@ManyToOne
	//@Enumerated(EnumType.STRING)
	private Categoria categoria;

	@Getter @Setter
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro = LocalDate.now();

	
}
