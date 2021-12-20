package com.reinaldo.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consCombustivel = consCombustivel;
	}
	
	public Carro() {
		
	}

	public Carro(String marca, String modelo) {
		this(marca,modelo,5);
		System.out.println("Chamando construtor com 2 parâmetros.");
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parâmetros.");
	}
	
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
	
