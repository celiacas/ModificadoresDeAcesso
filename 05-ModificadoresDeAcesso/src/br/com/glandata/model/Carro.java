package br.com.glandata.model;

public class Carro {

	
		private String marca;
		private int AnoFabricacao;
		private String Nome;
		private String Cor;
		
		//M�todos da Classe - N�o Devolve nada
		public void ligar() {
			System.out.println("O carro ligou");
		}
		
		//M�todos da Classe - Devolve algo
		
		public String buzina() {
			String somDaBuzina = "Bi biiiiii";
			return somDaBuzina;
		}	
		public void desligar() {
			System.out.println("O carro desligou");
		}
			 
	public int somanumeros(int numero1, int numero2) {
		int resultado = numero1+numero2;
		return resultado;
		
	}
	
	public int somanumeros(int numero1, int numero2, int numero3) {
		int resultado = numero1+numero2+numero3;
		return resultado;
		
	}

}
