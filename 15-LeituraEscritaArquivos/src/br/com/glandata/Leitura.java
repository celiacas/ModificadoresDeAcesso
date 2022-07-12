package br.com.glandata;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Leitura {

	public static void main(String[] args) throws IOException {
		
		Path path = Path.of("C:\\TesteJava\\lista-usuarios.txt");
		List<String> listaUsuario = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		int i = 1;
		for(String usuario : listaUsuario) {
			System.out.println("Linha " + i + usuario);
		}

	}

}
