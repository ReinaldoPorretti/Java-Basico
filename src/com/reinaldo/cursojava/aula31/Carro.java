package com.reinaldo.cursojava.aula31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	void exibirAutonomia(){	
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consCombustivel + " Km");	
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
	
		return this.capCombustivel * this.consCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdeCombustivel = km/this.consCombustivel;
		
		return qtdeCombustivel;
	}
}
