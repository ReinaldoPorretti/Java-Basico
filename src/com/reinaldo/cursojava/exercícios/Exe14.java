package com.reinaldo.cursojava.exercícios;

import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo:");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade da internet:");
		double velocidadeInternet = scan.nextDouble();
		
	
		double tempo= tamanhoArquivo / velocidadeInternet;
		
		System.out.println("Tempo de download: " + tempo);
		
	}

}