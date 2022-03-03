package com.company.oo.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BoiteNourriture<Biscuit> boite = new BoiteNourriture<>();
		
//		Chocolat c = new Chocolat(80, 40);
		Biscuit b = new Biscuit(50);
		Biscuit b1 = new Biscuit(30);
		
//		boite.ajouter(c);
		boite.ajouter(b);
		
		Biscuit m = Contenable.getHeaviest(b1, b);
		
		
		List<Biscuit> list= new ArrayList<>();
		addToList( m, list );
		
		
	}
	public static <T> boolean addToList( T toAdd, List<? super T> list ) {
		return list.add(toAdd);	
	}
	
	
}
