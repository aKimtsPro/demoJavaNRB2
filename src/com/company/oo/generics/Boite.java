package com.company.oo.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boite<T extends Contenable> {
	
	private List<T> elements = new ArrayList<>();
	
	public void ajouter(T element) {
		elements.add(element);
	}
	
	public T prendre() {
		if( elements.size() == 0 )
			return null;
		
		Random rdm = new Random();
		
		return elements.get( rdm.nextInt(elements.size()) );
	}
	
}
