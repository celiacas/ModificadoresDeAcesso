package br.com.glandata.main;

import br.com.glandata.TipoAnimal;
import br.com.glandata.models.Animal;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.setNome("Arara");
		animal.setTipoAnimal(TipoAnimal.MAMIFERO);
		
		System.out.println(animal);

	}

}
