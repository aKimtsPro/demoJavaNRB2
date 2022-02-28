package com.company.oo;

public enum TypeDiplome{

    BAC(2),
    MASTER(3),
    DOC(4),
    CESS(1);
	
	private final int difficulte;

	private TypeDiplome(int difficulte) {
		this.difficulte = difficulte;
	}

	public int getDifficulte() {
		return difficulte;
	}
	
	

}
