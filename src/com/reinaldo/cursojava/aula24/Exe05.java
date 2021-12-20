package com.reinaldo.cursojava.aula24;

public class Exe05 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldoConta = 100;
		
		System.out.println(conta.numero);
		System.out.println(conta.agencia);
		System.out.println(conta.especial);
		System.out.println(conta.limiteEspecial);
		System.out.println(conta.saldoConta);
		
	}

}
