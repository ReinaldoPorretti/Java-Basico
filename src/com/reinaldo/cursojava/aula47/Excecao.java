package com.reinaldo.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {
		
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso");
		} catch(ArrayIndexOutOfBoundsException exception) {
		
			System.out.println("Exceção ao acessar indice do vetor que nao existe");

		}
		System.out.println("Esse texto será impresso apos a exception");

	}
}