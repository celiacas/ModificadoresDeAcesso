package br.com.glandata.model;

//import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(exclude = "salariodia")
@EqualsAndHashCode
//@AllArgsConstructor
//@NoArgsConstructor

public class FolhaPagamento {
	
	public FolhaPagamento() {
	}
	
	public FolhaPagamento(Colaborador colaborador, Integer diastrabalhados, float salariodia, Integer faltas) {
		this.colaborador = colaborador;
		this.diastrabalhados = diastrabalhados;
		this.salariodia = salariodia;
		this.faltas = faltas;
	}



	@Getter 
	private Colaborador colaborador;
	
	@Getter @Setter
	private Integer diastrabalhados;
	
	@Getter @Setter
	private float salariodia;
	
	@Getter @Setter
	private Integer faltas;
	
	
	public float salario() {
		float salario = ((diastrabalhados - faltas) * salariodia);
		return salario;
		
	}


	public FolhaPagamento(Colaborador colaborador) {
		this.colaborador = colaborador;
	}


	
	
	

}
