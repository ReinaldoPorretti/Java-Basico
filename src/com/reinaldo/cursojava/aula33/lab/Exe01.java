package com.reinaldo.cursojava.aula33.lab;

public class Exe01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		lampada.mostrarStatus();
		
		lampada.desligar();
		
		lampada.mostrarStatus();
		
		lampada.mudarStatus();
		
		lampada.mostrarStatus();
	}

}
