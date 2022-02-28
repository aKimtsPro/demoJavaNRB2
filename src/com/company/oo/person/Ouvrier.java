package com.company.oo.person;

import com.company.oo.Salarie;

public class Ouvrier extends Personne implements Salarie {

	
	
	@Override
	public void saluer(Personne aSaluer) {}
	
	public class Outil{
		
		private int poid;

		public Outil(int poid) {
			super();
			this.poid = poid;
		}

		public int getPoid() {
			return poid;
		}

		public void setPoid(int poid) {
			this.poid = poid;
		}
		
		
	}
	
	

}
