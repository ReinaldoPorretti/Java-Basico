package com.reinaldo.cursojava.aula26;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consCombustivel + " Km ");
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		return capCombustivel * consCombustivel;
	}
}
