package br.com.glandata;

public class MainStrings {

	public static void main(String[] args) {
		
		String textoDinamico = "Ol� Ailton \n";
		String momentoDia = "Tarde";
		
		if(momentoDia.equals("manh�")){
			textoDinamico = textoDinamico + "Bom DIa!";
			textoDinamico = textoDinamico + "Bem vindo!";
		}
		else if (momentoDia.equals("tarde")) {
			textoDinamico = textoDinamico + "Bom Tarde!";
			textoDinamico = textoDinamico + "Bem vindo!";
			
		}
		else {
			textoDinamico = textoDinamico + "Bom Noite!";
			textoDinamico = textoDinamico + "Bem vindo!";
		}
		
		System.out.println(textoDinamico);

	}

}
