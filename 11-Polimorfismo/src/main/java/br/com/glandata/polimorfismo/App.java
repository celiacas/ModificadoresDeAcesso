package br.com.glandata.polimorfismo;

import br.com.glandata.polimorfismo.model.Designer;
import br.com.glandata.polimorfismo.model.EditorVideo;
import br.com.glandata.polimorfismo.model.Gerente;
import br.com.glandata.service.ControleBonificacao;

public class App {
	public static void main(String[] args) {
	
		Gerente gerente = new Gerente();
		gerente.setNome("Douglas");
		gerente.setSalario(5000.0);
		System.out.println("Autenticou?"+gerente.autentica(123456));
		
		EditorVideo  editorvideo  = new EditorVideo();
		editorvideo.setNome("Ailton");
		editorvideo.setSalario(2500.0);
		
		Designer designer = new Designer();
		designer.setNome("Sandra");
		designer.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editorvideo);
		controle.registra(designer);
		
		System.out.println(controle.getSoma());
				
	}
}
