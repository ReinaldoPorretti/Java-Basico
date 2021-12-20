package com.reinaldo.cursojava.exercícios;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor/hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas de trabalho:");
		double horas = scan.nextDouble();
		
	
		double salarioBruto= valorHora * horas;
		double inss = (salarioBruto /100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário líquido: " + salarioLiquido);
		
	}

}