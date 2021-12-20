package com.reinaldo.cursojava.aula30;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro("Fiat", "Grand Siena");
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
	}

}
