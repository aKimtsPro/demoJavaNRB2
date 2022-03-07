package com.company.oo.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.company.oo.excepts.MaxPoidDepasseException;

public class Boite<T extends Contenable> {
	
	private final List<T> elements = new ArrayList<>();
	private final int maxPoid;
	
	public Boite(int maxPoid) {
		super();
		this.maxPoid = maxPoid;
	}
	
	public int getMaxPoid() {
		return maxPoid;
	}

	public void ajouter(T element) {
		
		int poidActuel = poidTotal();
		if( element.getPoid() + poidActuel > maxPoid )
			throw new MaxPoidDepasseException(maxPoid, poidActuel, element.getPoid());
			
		elements.add(element);
	}
	
	public T prendre() {
		if( elements.size() == 0 )
			return null;
		
		Random rdm = new Random();
		
		return elements.get( rdm.nextInt(elements.size()) );
	}
	
	public int poidTotal() {
		return this.elements.stream()
				.collect( Collectors.summingInt(Contenable::getPoid) );
	}
	
}
