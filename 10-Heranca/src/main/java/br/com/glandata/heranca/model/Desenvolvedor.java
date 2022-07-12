package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Desenvolvedor extends Funcionarios {
	
	
	public Desenvolvedor(int registro, String nome) {
		super(registro, nome);
		
	}

	@Getter  @Setter
	private boolean acessaservidor;
	
	@Setter
	private float salario;
	
	
	@Override
	public float getSalario() {
		return super.getSalario();
	}
	
	
	
   // @Override
   // public float getSalario() {
   // 	return this.salario *1.10;
	//}
	
	
	
}
