package br.com.glandata;

public class MainBuffer {

	public static void main(String[] args) {
		
		StringBuffer textoDinamico = new StringBuffer();
		textoDinamico.append("Ol? Ailton ");
		
		String momentoDia = "noite";
		
		if(momentoDia.equals("manha")) {
			textoDinamico.append("Bom Dia");
		} 
		else if (momentoDia.equals("tarde")) {
			textoDinamico.append("Bom Tarde");
		}
		else {
			textoDinamico.append("Bom Noite");			
     	}
	
		textoDinamico.append("\n Bem Vindo!");
		System.out.println(textoDinamico.toString());
		
}

}
