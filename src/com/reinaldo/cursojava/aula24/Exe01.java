package com.reinaldo.cursojava.aula24;

public class Exe01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampi�es";
	}

}
