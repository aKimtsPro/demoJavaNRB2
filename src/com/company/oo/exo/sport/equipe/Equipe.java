package com.company.oo.exo.sport.equipe;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.company.oo.exo.compet.Competiteur;
import com.company.oo.exo.sport.Sportif;

public class Equipe<T extends EnEquipe<T>> implements Competiteur{

	private String nom;
	private final Set<T> joueurs = new HashSet<>();
	
	public Equipe(String nom) {
		super();
		this.nom = nom;
	}

	public Set<T> getJoueurs() {
		return new HashSet<T>(joueurs);
	}

	public boolean add(T toAdd) {
		
		if( !(toAdd instanceof Sportif) )
			return false;
			
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

	@Override
	public int performer() {
		return joueurs.stream().collect(Collectors.summingInt((p) -> p.performer()));
	}
	
}
