package com.reinaldo.cursojava.exerc�cios;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Farenheit:");
		double f = scan.nextDouble();
		
		double c = (5 *(f-32) / 9);
		
		System.out.println("A temperatura: " + f + " F � igual a " + c + " C");
		
	}

}