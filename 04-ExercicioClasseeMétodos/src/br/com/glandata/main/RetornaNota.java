package br.com.glandata.main;

import br.com.glandata.model.Aluno;

public class RetornaNota {

	public static void main(String[] args) {
		
    Aluno aluno = new Aluno();

     aluno.nome = "Célia";
     aluno.nota1 = 2.5f;
     aluno.nota2 = 8.0f;
     aluno.nota3 = 5.5f;
    
     if (aluno.calculamedia() >= 5) {
    	 System.out.println("Aluno(a): " + aluno.nome + " foi Aprovado(a)");
     }else {
    	 System.out.println("Aluno(a): " + aluno.nome + " foi Rerovado(a)");
     }
  		 
	}

}
