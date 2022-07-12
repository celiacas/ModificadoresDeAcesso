package br.com.glandata.heranca;

import br.com.glandata.heranca.model.Desenvolvedor;
import br.com.glandata.heranca.model.Gerente;

public class App {
	public static void main(String[] args) {
		 float salariobase = 1000.00f;
		 
		Desenvolvedor dev = new Desenvolvedor(799, "Ailton");
		
		//dev.setNome("Célia");	
		//dev.setRegistro(120343);
		dev.setAcessaservidor(true);
		dev.setIdade(30);
		dev.setEndereco("Rua dos Bobos, no 0");
		
		Gerente gerente = new Gerente(123, "Nelson");
		//gerente.setNome("Nelson");
		//gerente.setRegistro(12345);
		gerente.setSalario(2000.00f);
		gerente.setAcessoconta(true);	
		gerente.setEndereco("Não Sei");  
		gerente.setIdade(70);
		
		System.out.println(dev);
		
		System.out.println(gerente);

		
	}
}
