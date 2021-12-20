package com.reinaldo.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;

	/*void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consCombustivel + " Km ");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consCombustivel;
	}*/
	
	Carro(){
		System.out.println("Classe carro instanciada.");
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consCombustivel = consCombustivel_;
	}
	double calcularCombustivel(double km) {
		double qtdeCombustivel = km / consCombustivel;
		return qtdeCombustivel;
	}
}
