package com.company.oo.exo.sport.indiv;

import com.company.oo.exo.compet.Competiteur;
import com.company.oo.exo.sport.Sportif;

public abstract class SportifIndividuel extends Sportif implements Individuel, Competiteur{

	public SportifIndividuel(String nom, String prenom) {
		super(nom, prenom);
	}

	@Override
	public void incrementNbrVictoire() {
		this.setNbrVictoire(getNbrVictoire()+1);
	}

}
