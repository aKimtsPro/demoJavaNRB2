package com.company.oo.generics;

public interface Contenable {
	
	int getPoid();
	
	public static <T extends Contenable> T getHeaviest(T e1, T e2) {
		return e1.getPoid() >= e2.getPoid() ? e1 : e2 ;	
	}
	
}
