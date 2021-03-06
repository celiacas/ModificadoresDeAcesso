package br.com.glandata.polimorfismo;

import br.com.glandata.polimorfismo.service.Formatter;
import br.com.glandata.polimorfismo.service.RemovePonto;
import br.com.glandata.polimorfismo.service.RemoveTraco;

public class App 
{
    public static void main( String[] args )
    {
  
    	String texto = "nome-do-projeto:Glandata.Polimorfismo...";
    	
    	String CSV = "Ailton;Rua dos Bobos;991234567";
    	
    	String[] dadosUsuario = CSV.split(";");
    	
    	String nome= dadosUsuario[0];
    	String endereco= dadosUsuario[1];
    	String telefone= dadosUsuario[2];
    	
    	System.out.println(nome);
    	System.out.println(endereco);
    	System.out.println(telefone.replaceAll(" ", ""));
    	
    	//String nome = CSV.split(";")[0];
    	
    	System.out.println(CSV);
    	
    	
    	// métodos estáticos podem ser invocados sem instanciar a classe
    	System.out.println(Formatter.removePonto(texto));
    	System.out.println(Formatter.removeTraco(texto));
    	
    	// exemplo simplificado do polimorfismo
    	Formatter removeponte = new RemovePonto();
    	System.out.println(removeponte.remove(texto));
    	
    	Formatter removeTraco = new RemoveTraco();
    	System.out.println(removeTraco.remove(texto));
    	
    	
    }
}
