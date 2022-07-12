package br.com.glandata.enums;

public enum PerfilUsuario {
	
	USER(1, "usuario", "Pode realizar consultas"), 
	ADMIN(2, "administrador", "Pode parametrizar o sistema"), 
	GER(3, "gerente", "Pode lançar informações críticas");

	PerfilUsuario(int codigo, String nome, String descricao) {
		
	}
	private int codigo;
	private String nome;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

