package br.com.glandata;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaArrayList {

public static void main(String[] args) {
	
	ArrayList<String> agenda = new ArrayList<String>();
	agenda.add("Giancarlo;1199999999");
	agenda.add("Amanda;119888888");
	agenda.add("Alessandra;117777777");
	agenda.add("Kelly;117777777");
	
	int i;
	
	System.out.println("Percorrendo os contatos N da agenda usando indices");
	int n = agenda.size();
	for(i=0;i<=n-1;i++) {
		System.out.printf("Posi??o %d- %s \n ", i, agenda.get(i));
		
	}
	
	Scanner ler = new Scanner(System.in);
	System.out.println("informe a posi??o a ser exclu?da: ");
	i= ler.nextInt();
	agenda.remove(i);
	i = 0;
	System.out.println("Percorrendo os resultados da agenda enhanced For ");
	
	for(String contato :agenda) {
		System.out.printf("Posi??o ",  i, " - " +  contato);
		i++;
	}
	
	
	
}
		
}
