package br.com.glandata;

public class Pilha {

	public static void main(String[] args) throws Exception {	
		System.out.println("Inicio do m?todo main");		
		
		metodo1(4);
		
		/*
		try {
			metodo1(4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/		
		System.out.println("Fim do m?todo main");

	}

	private static void metodo1(int imposto) throws Exception {
		
		System.out.println("Inicio do m?todo 1");
		
		if(imposto<5) {
			
			Exception exception = new Exception("O valor do imposto est? incorreto!");
			//System.out.println("O valor do imposto est? incorreto!");
			throw exception;
			
		}
		metodo2();
		
		System.out.println("Fim do m?todo 1");
		
	}
		
	private static void metodo2() {
		System.out.println("Inicio do m?todo 2");
		try {
			int numero = 4;	
			System.out.println(numero/2);
		} catch (ArithmeticException a) {
			System.out.println(a);
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			//con.close;
			// independente de erro ou n?o tendo erro executa o
			// conte?do
		}
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("O valor de i="+i);
		}
}
	
}