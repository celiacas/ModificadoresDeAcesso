import br.glandata.com.br.model.Conta;

public class bug {

	public static void main(String[] args) {
		Conta contaA = new Conta();
		contaA.titular = "Ailton";
		
		System.out.println("Titular A: " + contaA.titular);
		
		Conta contaB = new Conta();
		contaB = contaA;
		System.out.println("Titula B: " + contaA.titular);		
		
		
		contaB.titular = "Alessandra";
		System.out.println("Titula: " + contaA.titular);
		System.out.println("Titula: " + contaA.titular);
		
	
		//Objetos n�o poder ser sobrescritos eles recebem a mesma refer�ncia
		
		

	}

}
