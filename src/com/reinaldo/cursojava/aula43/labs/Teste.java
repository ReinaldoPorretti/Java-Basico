package com.reinaldo.cursojava.aula43.labs;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** Teste ContaBancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111");
				
		contaSimples.depositar(100);
		
		/*realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);
		
		private static void realizarSaque(contaBancaria conta, double valor) {
			if (contaSimples.sacar(valor)) {
				System.out.println("Saque efetuado com sucesso. Novo saldo: " + contaSimples.getSaldo());
			}else {
				System.out.println("Saldo insuficiente para saque de " + valor + "; Saldo de: " + contaSimples.getSaldo());

			}
		}*/
		
	}

}


