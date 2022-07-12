package br.com.glandata.main;

import br.com.glandata.enums.PerfilUsuario;

public class TestaTipoPerfil {

	public static void main(String[] args) {
		
		PerfilUsuario perfilUsuario = PerfilUsuario.USER;

		//String perfil = "USER"
		
		//System.out.println(perfilUsuario.valueOf(perfil));
		
		System.out.println(perfilUsuario);
		System.out.println(perfilUsuario.getDescricao());
		System.out.println(perfilUsuario.getNome());


	}

}
