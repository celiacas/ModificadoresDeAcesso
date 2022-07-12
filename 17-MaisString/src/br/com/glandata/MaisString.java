package br.com.glandata;

public class MaisString {

	public static void main(String[] args) {

			
		// Localiza Posi��o de um texto
		String nome = "Ailton";
		int pos = nome.indexOf("to");
		System.out.println(pos);
		
		
		// Pega caracter em determinada posi��o
		String nome2 = "Pedro";
		char c = nome2.charAt(2);
		System.out.println(c);
		
		// Pega conte�do depois de determinada posi��o
		String nome3 = "Amanda";
		String sub = nome3.substring(1);
		System.out.println(sub);
		
		
		// Pega a quantidade de caracteres de uma String
		String nome4 = "Giancarlo";
		System.out.println(nome4.length());
		
		// Podemos combinar os recursos
		String nome5 = "Alessandra";
		System.out.println(nome5.length());

		for(int i = 0; i < nome5.length(); i++) {
		    System.out.println(nome5.charAt(i));
		}
		
		// Verifica se o String est� vazio
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		
		// remove os espa�os do in�cio e fim de uma string
		String vazio2 =" ";
		String outroVazio = vazio2.trim(); 

		System.out.println(outroVazio.isEmpty());
		
		// mostra o funcionamento do trim
		String vazio3 ="    Glan Data Sistemas    ";
		String outroVazio2 = vazio3.trim(); 
		System.out.println(outroVazio2);
		
		// verifica se uma string cont�m determinado caracter
		System.out.println(vazio3.contains("Siste"));
		

	}

}