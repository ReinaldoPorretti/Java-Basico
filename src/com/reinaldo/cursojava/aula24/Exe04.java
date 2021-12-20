package com.reinaldo.cursojava.aula24;

import java.util.Date;

public class Exe04 {

	public static void main(String[] args) {

		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Loiane";
		
		
		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.anoLancamento);
		System.out.println(livro.emprestado);
		System.out.println(livro.dataEntrega);
		System.out.println(livro.emprestadoA );
	}

}
