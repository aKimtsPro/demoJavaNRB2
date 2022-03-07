package com.company.oo.exo.exceptions;

public class NotEnoughParticipantException extends RuntimeException {
	
	private final int expected;
	private final int actual;
	
	public NotEnoughParticipantException(int expected, int actual) {
		super("Pas assez de participants \nexpected: "+ expected + "; \nactual: " + actual + ";");
		this.expected = expected;
		this.actual = actual;
	}
	
	public int getExpected() {
		return expected;
	}
	public int getActual() {
		return actual;
	}
	
	

}
