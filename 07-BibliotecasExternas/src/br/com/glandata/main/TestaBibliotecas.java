package br.com.glandata.main;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.glandata.models.Pessoa;

public class TestaBibliotecas {

	public static void main(String[] args) {
		
		Formatter formatter = new CPFFormatter();
		
		//Detalhado
		Pessoa pessoa = new Pessoa("Celia", "14040029879");
			
		String CpfNaoFormatado = pessoa.getCpf();
		
		String CpfFormatado =  formatter.format(pessoa.getCpf());
		
		System.out.println(CpfFormatado);
		
		
		//Utilizado
		Pessoa pessoa2 = new Pessoa("Ailton", formatter.format(CpfNaoFormatado));
		System.out.println(pessoa2);
		

	}

}
