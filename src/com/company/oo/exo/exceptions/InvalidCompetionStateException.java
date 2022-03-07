package com.company.oo.exo.exceptions;

public class InvalidCompetionStateException extends IllegalStateException {
	
	private final boolean competitionFinished;

	public InvalidCompetionStateException(boolean competitionFinished) {
		super(competitionFinished ? "action illegal pour une competition termine":"action illegal pour une competition non termine");
		this.competitionFinished = competitionFinished;
	}

	public boolean isCompetitionFinished() {
		return competitionFinished;
	}
	
}
