package com.company.oo.exo.sport.equipe;

import java.util.Random;

public class JoueurFoot extends SportifEnEquipe {
	
	private int nbrGoal;
	private Equipe equipe;

	public JoueurFoot(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public JoueurFoot(String nom, String prenom, Equipe equipe) {
		super(nom, prenom);
		this.equipe = equipe;
	}

	@Override
	public int performer() {
		return new Random().nextInt(3);
	}
	
	public int scoreGoal() {
		return this.nbrGoal++;
	}
	
	public int scoreGoal(int nbrGoal) {
		if(nbrGoal < 0)
			nbrGoal = 0;
		
		return this.nbrGoal += nbrGoal;
	}

	public int getNbrGoal() {
		return nbrGoal;
	}

	
	
	

}
