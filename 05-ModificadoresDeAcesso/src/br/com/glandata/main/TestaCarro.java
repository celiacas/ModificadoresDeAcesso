package br.com.glandata.main;

import br.com.glandata.model.Carro;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro carroA = new Carro();
		
		carroA.ligar();
		  //System.out.println(carroA.buzinar());
		
		  carroA.desligar();
		  
		  System.out.println("Soma dois números:" +carroA.somanumeros(100, 5));
		  
		  System.out.println("Soma três números:" +carroA.somanumeros(50, 10, 5));
	}

}