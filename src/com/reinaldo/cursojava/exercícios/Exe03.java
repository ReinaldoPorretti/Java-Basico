package com.reinaldo.cursojava.exerc�cios;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		int numero1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero:");
		int numero2= scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("O resultado �: " + resultado);
	}

}
