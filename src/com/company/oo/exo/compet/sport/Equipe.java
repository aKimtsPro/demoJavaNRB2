package com.company.oo.exo.compet.sport;

import java.util.HashSet;
import java.util.Set;

public class Equipe {

	private String nom;
	private final Set<EnEquipe> joueurs = new HashSet<>();
	
	public Equipe(String nom) {
		super();
		this.nom = nom;
	}

	public Set<EnEquipe> getJoueurs() {
		return new HashSet<EnEquipe>(joueurs);
	}

	public boolean add(EnEquipe toAdd) {
		if( joueurs.add(toAdd) ) {
			toAdd.setEquipe(this);
			return true;
		}
		return false;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
