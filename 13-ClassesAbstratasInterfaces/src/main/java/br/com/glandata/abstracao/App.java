package br.com.glandata.abstracao;

import br.com.glandata.abstracao.service.Gerente;

public class App 
{
    public static void main( String[] args )
    {
    	//System.out.println("testando classe abstrata");
    	
    	Gerente gerente = new Gerente();
    	
    	gerente.calculahoras();
    	 	
    	
    }
}
