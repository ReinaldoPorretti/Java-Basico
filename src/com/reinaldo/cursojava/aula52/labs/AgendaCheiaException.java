package com.reinaldo.cursojava.aula52.labs;

public class AgendaCheiaException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Agenda já está cheia";
	}
}
