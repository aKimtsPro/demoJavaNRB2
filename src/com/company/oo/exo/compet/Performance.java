package com.company.oo.exo.compet;

public class Performance {

    private Competiteur competiteur;
    private int score;

    public Performance(Competiteur competiteur, int score) {
        this.competiteur = competiteur;
        this.score = score;
    }

	public Competiteur getCompetiteur() {
		return competiteur;
	}

	public void setCompetiteur(Competiteur competiteur) {
		this.competiteur = competiteur;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
    
    
}
