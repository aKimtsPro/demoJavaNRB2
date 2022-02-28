package com.company.oo.exo.compet.sport;

public class JoueurFoot extends Sportif implements EnEquipe {
	
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
		return 0;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
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
