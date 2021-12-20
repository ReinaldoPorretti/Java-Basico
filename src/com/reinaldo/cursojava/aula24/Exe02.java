package com.reinaldo.cursojava.aula24;

public class Exe02 {

	public static void main(String[] args) {

		Livro livro = new Livro();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.anoLancamento);
	}

}
