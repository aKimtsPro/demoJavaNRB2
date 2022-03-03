package com.company.oo.exo.sport.equipe;

import java.util.Random;

import com.company.oo.exo.sport.Sportif;

public class JoueurFoot extends Sportif implements EnEquipe<JoueurFoot>{
	
	private int nbrGoal;
	private Equipe<JoueurFoot> equipe;

	public JoueurFoot(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public JoueurFoot(String nom, String prenom, Equipe<JoueurFoot> equipe) {
		super(nom, prenom);
		this.equipe = equipe;
	}

	@Override
	public int performer() {
		return new Random().nextInt(3);
	}
	
	@Override
	public Equipe<JoueurFoot> getEquipe() {
		return this.equipe;
	}

	

	@Override
	public void setEquipe(Equipe<JoueurFoot> equipe) {
		this.equipe = equipe;
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
