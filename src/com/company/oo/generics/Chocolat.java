package com.company.oo.generics;

public class Chocolat implements Mangeable {

	private int tauxPurete;
	private int poid;
	
	public Chocolat(int tauxPurete, int poid) {
		super();
		this.tauxPurete = tauxPurete;
		this.poid = poid;
	}

	public int getTauxPurete() {
		return tauxPurete;
	}

	public void setTauxPurete(int tauxPurete) {
		this.tauxPurete = tauxPurete;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}
	
	
	
	
	
}
