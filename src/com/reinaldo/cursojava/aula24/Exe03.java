package com.reinaldo.cursojava.aula24;

public class Exe03 {

	public static void main(String[] args) {

		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.anoLancamento);
		System.out.println(livro.preco);
	}

}
