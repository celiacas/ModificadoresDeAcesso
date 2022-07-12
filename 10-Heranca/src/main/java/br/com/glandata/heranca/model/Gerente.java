
package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Gerente extends Funcionarios {

	
	public Gerente(int registro, String nome) {
		super(registro, nome);
	}

 @Setter
	private float salario;
	
	@Getter @Setter
	private boolean acessoconta;
	

}
