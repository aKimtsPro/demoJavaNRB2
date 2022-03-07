package com.company.oo.excepts;

public class MaxPoidDepasseException extends RuntimeException {
	
	private final int poidMax;
	private final int poidAjoute;
	private final int poidActuel;

	public MaxPoidDepasseException(int poidMax, int poidActuel, int poidAjoute ) {
		super("Le poid max de la boite serait dépassé");
		this.poidMax = poidMax;
		this.poidAjoute = poidAjoute;
		this.poidActuel = poidActuel;
	}

	public int getPoidMax() {
		return poidMax;
	}

	public int getPoidAjoute() {
		return poidAjoute;
	}

	public int getPoidActuel() {
		return poidActuel;
	}

}
