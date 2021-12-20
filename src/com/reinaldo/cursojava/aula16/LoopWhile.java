package com.reinaldo.cursojava.aula16;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*int i = 1;
		int max = 10;
		
		System.out.println("Contando até " + max);

		while (i < max) {
			System.out.println("Valor de i " + i);
			i++;
		}
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);	
		}while( i < 13);
		
		System.out.println(i);
		
		boolean notaValida = false;
		
		do {
			
			System.out.println("Entre com uma nota:");
			
			double nota = scan.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			}else {
				System.out.println("Nota inválida, digite novamente.");
			}
			
		}while(!notaValida);
		
		boolean infoValidas = false;
		do {
			
			System.out.println("Entre com o nome do usuário:");
			String nomeUser= scan.next();
			
			System.out.println("Entre com a senha:");
			String senha = scan.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Senha igual a usuário, digite novamente.");
			}else {
				infoValidas = true;
				System.out.println("Usuário e senha corretos.");
			}
		}while(!infoValidas);*/
		
		boolean infoValida = false;
		String nome, sexo, estadoCivil ;
		int idade;
		double salario;
		
		do {
			
			System.out.println("Entre com o nome:");
			nome = scan.next();
			
			if (nome.length() > 3) {
				infoValida = true;
			}else {
				System.out.println("Nome precisa de no mínimo 3 caracteres.");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			
			if (idade > 0 && idade <= 150) {
				infoValida = true;
			}else {
				System.out.println("Idade precisa estar entre 0 e 150.");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com o salário:");
			salario = scan.nextDouble();
			
			if (salario > 0 ) {
				infoValida = true;
			}else {
				System.out.println("Salário precisa ser maior que 0");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com o sexo:");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") ||
					(sexo.equalsIgnoreCase("m"))) {
				infoValida = true;
			}else {
				System.out.println("Sexo precisa ser 'f' ou 'm'");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com o estado civil:");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d")){
				infoValida = true;
			}else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'c'.");
			}
		}while(!infoValida);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);


	}

}
