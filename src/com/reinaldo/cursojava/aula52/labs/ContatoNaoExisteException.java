package com.reinaldo.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception {

	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Contato " + nomeContato + " não existe na agenda";
	}
}