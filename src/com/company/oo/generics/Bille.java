package com.company.oo.generics;

public class Bille implements Contenable {
	private double diametre;
	private int poid;

	public Bille(double diametre, int poid) {
		super();
		this.diametre = diametre;
		this.poid = poid;
	}

	public double getDiametre() {
		return diametre;
	}

	public void setDiametre(double diametre) {
		this.diametre = diametre;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}
	
	
	
}
