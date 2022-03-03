package com.company.oo.exo.sport.equipe;

import com.company.oo.exo.sport.Sportif;

public abstract class SportifEnEquipe extends Sportif implements EnEquipe {

	private Equipe equipe;
	
	public SportifEnEquipe(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public SportifEnEquipe(String nom, String prenom, Equipe equipe) {
		super(nom, prenom);
		this.equipe = equipe;
	}

	@Override
	public Equipe getEquipe() {
		return equipe;
	}

	@Override
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	

}
