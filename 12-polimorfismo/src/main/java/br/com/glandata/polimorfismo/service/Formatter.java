package br.com.glandata.polimorfismo.service;

public class Formatter {
	
	public String remove(String text) {
		return null;
		
	}
	
	public static String removePonto(String text) {
		return text.replaceAll(".", "");
	}
	

public static String removeTraco(String text) {
	return text.replaceAll("-", "");
}

}
