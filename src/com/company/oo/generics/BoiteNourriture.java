package com.company.oo.generics;

public class BoiteNourriture<T extends Mangeable> extends Boite<T>{

	public BoiteNourriture(int maxPoid) {
		super(maxPoid);
	}
	
	
}
