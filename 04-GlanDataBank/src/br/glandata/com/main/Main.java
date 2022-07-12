package br.glandata.com.main;

import br.glandata.com.br.model.Conta;
import br.glandata.com.br.model.Titular;

public class Main {

	public static void main(String[] args) {

		Titular titularA = new Titular();
		
		titularA.nome = "Ailton";
		titularA.endereco = "Rua 123";
		titularA.telefone = "99138-2831";
		
		Conta conta = new Conta();
         
         conta.agencia = 1234;
         conta.numero = 005;
         conta.saldo = 457.00;
         conta.titular = titularA;
        	
         Conta conta2 = new Conta();
         
         conta2.agencia = 0012;
         conta2.numero = 00012;
         conta2.saldo = 1000.34;
         conta2.titular.nome = "Jeferson";
         
         
         System.out.println("Titular da Conta: " + conta.titular.nome);
         System.out.println("Salda da Conta: " + conta.saldo);
         
         System.out.println("\n");	
         System.out.println("Titular da Conta: " + conta2.titular.nome);
         System.out.println("Salda da Conta: " + conta2.saldo);
         
         System.out.println("\n");
         System.out.println("Saldo das Conta: " + (conta.saldo+conta2.saldo));
	}

}
