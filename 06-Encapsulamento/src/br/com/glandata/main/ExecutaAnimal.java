package br.com.glandata.main;

import br.com.glandata.model.Animal;

public class ExecutaAnimal {

	public static void main(String[] args) {
		
		Animal ave = new Animal();
		ave.setTipo("Ave");
		ave.setTipoalimentacao("Carnivora");
		ave.setNome("Falcão Real");
		ave.setIdademaxima(70);
		ave.setMeiolocaomocao("Voar");

		Animal foca = new Animal();
		foca.setNome("Geraldo");
		foca.setTipo("Mamifero");
		foca.setTipoalimentacao("Algas");
		foca.setIdademaxima(20);
		foca.setMeiolocaomocao("Nado / Arrasto");
		
		/*
		System.out.println(ave.getNome());
		System.out.println(foca.getNome());
		
		System.out.println(ave.toString());
		System.out.println(foca.toString());
		*/
		
		Animal foca2 = new Animal();
		foca2.setNome("Geraldo");
		foca2.setTipo("Mamifero");
		foca2.setTipoalimentacao("Algas");
		foca2.setIdademaxima(20);
		foca2.setMeiolocaomocao("Nado / Arrasto");
		
		/*
		int numeroA = 5;
		int numeroB = 5;
		
		System.out.println((foca==foca2) ? "Igual" : "Diferente");
		*/
		
		System.out.println(foca.equals(foca2) ? "Igual" : "Diferente");
			
	}

}
