package com.reinaldo.cursojava.aula24;

public class Exe06 {

	public static void main(String[] args) {

		Contato contato = new Contato();
		
		contato.nome = "João";
		contato.email  ="joao@gmail.com";
		contato.endereco = "Av Paulista 1000";
		
		contato.telefones = new String[5];
		contato.telefones[0] = "9999-9999";
		contato.telefones[1] = "9888-8888";
		contato.telefones[2] = "9777-7777";
		
		System.out.println(contato.nome);
		System.out.println(contato.email);
		System.out.println(contato.endereco);
		System.out.println(contato.telefones[0]);
		System.out.println(contato.telefones[1]);
		System.out.println(contato.telefones[2]);
	}

}
