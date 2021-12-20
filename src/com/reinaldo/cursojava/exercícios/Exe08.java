package com.reinaldo.cursojava.exercícios;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor/hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas de trabalho:");
		double horas = scan.nextDouble();
		
	
		double salario= valorHora * horas;
		
		System.out.println("O salário é de: " + salario);
		
	}

}