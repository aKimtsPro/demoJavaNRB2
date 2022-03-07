package com.company.oo.excepts;

import java.sql.SQLException;

import com.company.oo.generics.Boite;
import com.company.oo.generics.Chocolat;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
//		Thread.sleep(1000);
		
		
		try {
			// le code a executer
//			String a = "15";
			String a = "bonjour";
			int b = Integer.parseInt(a);
			System.out.println("ca a fonctionné");
//			a = null;
			
			System.out.println(a.length());
			return;
		}
		catch( NullPointerException | IndexOutOfBoundsException  ex ) {
			System.out.println("La chaine est null");
		}
		catch( RuntimeException ex ) {
			System.out.println("Chaine de caractere invalide");
		}
		finally {
			System.out.println("finally");
		}
		
		
		// La boite
		
		Boite<Chocolat> boite = new Boite<>(100);
		
		try {
			boite.ajouter(new Chocolat(50, 80));
			boite.ajouter(new Chocolat(90, 30));
		}
		catch( MaxPoidDepasseException ex ) {
			System.out.println("erreur rencontrée: " + ex.getMessage());
			System.out.println("poid max: " + ex.getPoidMax());
			System.out.println("poid actuel: " + ex.getPoidActuel());
			System.out.println("poid ajouté: " + ex.getPoidAjoute());
		}
		
		System.out.println("fin du programme");
		
		
		
		
		
		
		
	}
	
}
