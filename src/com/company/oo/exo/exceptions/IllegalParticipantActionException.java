package com.company.oo.exo.exceptions;

import com.company.oo.exo.compet.Competiteur;

public class IllegalParticipantActionException extends IllegalArgumentException {

	private final Competiteur competiteur;
	private final boolean alreadyIn;
	
	public IllegalParticipantActionException(Competiteur competiteur) {
		this(competiteur, true);
	}

	public IllegalParticipantActionException(Competiteur competiteur, boolean alreadyIn) {
		super(alreadyIn ? "Impossible d'ajouter un participant déjà inscrit": "Impossible de désinscrire un participant non inscrit");
		this.competiteur = competiteur;
		this.alreadyIn = alreadyIn;
	}

	public Competiteur getCompetiteur() {
		return competiteur;
	}

	public boolean isAlreadyIn() {
		return alreadyIn;
	}
	
	
	
}
