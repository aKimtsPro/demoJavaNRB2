package com.company.oo.person;

import com.company.oo.Diplome;

public abstract class Personne{

    String nom;
    String prenom;
    double salaire;
    Diplome diplome;

    public Personne() {}

    public Personne(String nom, String prenom, Diplome diplome) {
        this.nom = nom;
        this.prenom = prenom;
        this.diplome = diplome;

        if( diplome == null )
            salaire = 1600;
        else {
            switch ( diplome.getType() ){
                case CESS:
                    salaire = 1800;
                    break;
                case BAC:
                    salaire = 2000;
                    break;
                case MASTER:
                    salaire = 2200;
                    break;
                case DOC:
                    salaire = 2400;
                    break;
            }
        }

    }

    public void saluer(Personne aSaluer, boolean inclureNom){
        System.out.println("Salut" + (inclureNom ? " "+aSaluer.prenom : ""));
    }

    public abstract void saluer(Personne aSaluer);

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if( !(obj instanceof Personne) ) return false;
		
		Personne p = (Personne)obj;
		
		return this.prenom.equals(p.prenom) && this.nom.equals(p.nom);	
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + ", diplome=" + diplome + "]";
	}

	
    

}
