package com.reinaldo.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite a idade: ");
		int idade = scan.nextInt();
		
		if (idade >=18) {
			System.out.println("Maior de idade.");
		}else {
			System.out.println("N�o � maior de idade.");
		}*/
		
		System.out.println("Entre com o pre�o do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Est� barato, pode comprar!");
		}else if (valor > 10 && valor < 15){
			
		}
	
	}

}
