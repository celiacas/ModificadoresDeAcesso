package br.com.glandata;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Escrita {

	public static void main(String[] args) throws IOException {
		
		Path path = Path.of("C:\\TesteJava\\texto.txt");
		
		String texto = "Arquivo e texto gerado com java e com suporte a acentua??o";
		
		Files.writeString(path, texto, StandardCharsets.UTF_8);
		
		List<String> listaUsuarios =  Arrays.asList("Ailton", "Camila", "Pedro", "Kelly", "Gian");
		List<String> listaTelefone =  Arrays.asList("123", "456", "789", "10112", "1234");
		
		Path path2 = Path.of("C:\\TesteJava\\lista-usuarios.txt");
		
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("Lista de Usu?rios e N?meros de Linhas");
		
		int i =1;
		
		for(String usuario: listaUsuarios) {
			stringbuffer.append("\nLinha " + i + ": \t"+usuario);
			i++;
		}
		
		Files.writeString(path2, stringbuffer, StandardCharsets.UTF_8);
		
		// Gerando CSV da lista de usu?rios
		
		Path path3 = Path.of("C:\\TesteJava\\listaUsuarios.csv");
		StringBuffer stringbuffer2 = new StringBuffer();
		
        int j =0;
		
		for(String usuario: listaUsuarios) {
			stringbuffer2.append(usuario +";" + listaTelefone.get(j) +"\n");
			//System.out.println(listaTelefone.get(j));
			j++; 
		}
		
		Files.writeString(path3, stringbuffer2, StandardCharsets.UTF_8);
		
		
	}

}
