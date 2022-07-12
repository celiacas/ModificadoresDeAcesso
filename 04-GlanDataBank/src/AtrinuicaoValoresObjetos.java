import br.glandata.com.br.model.Conta;
import br.glandata.com.br.model.Titular;

public class AtrinuicaoValoresObjetos {

	public static void main(String[] args) {
		Titular titularA = new Titular();
		
		titularA.nome = "Ailton";
		titularA.endereco = "Rua 123";
		titularA.telefone = "99138-2831";
		
		Titular titularB = new Titular();
		titularB.nome = "Celia";
		titularB.endereco = "Rua Javri";
		titularB.telefone = "99138-2817";
		
		Conta contaA = new Conta();
		contaA.agencia = 123;
		contaA.numero = 456;
		contaA.saldo  = 127.90;
		contaA.titular = titularA;
		
		Conta contaB = new Conta();
		contaB.agencia = contaA.agencia;
		contaB.numero = contaA.numero ;
		contaB.saldo  = contaA.saldo;
		contaB.titular = titularB;
		
		
		System.out.println(contaA.titular.nome);
		System.out.println(contaA.saldo);
		
		System.out.println("\n");
		
		contaB.titular.nome = "Pedro Pessoa";
		
		System.out.println(contaB.titular.nome);
		System.out.println(contaB.saldo);

	}

}
