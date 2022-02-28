package com.company.oo.person;

import com.company.oo.Diplome;
import com.company.oo.Salarie;
import com.company.oo.person.Personne;

public class Employe extends Personne implements Salarie{

    String fonction;

    public Employe(String nom, String prenom, Diplome diplome, String fonction) {
        super(nom, prenom, diplome);
        this.fonction = fonction;
    }
    
    void travailler(){
        System.out.println(this.prenom + " " + this.nom + " va travailler...");
        saluer(this);
    }

    @Override
    // signature : nom-params-Class
    public void saluer(Personne aSaluer) {
        System.out.println("Salutation m." + aSaluer.nom);
    }

    protected String saluer(){
        return "salut ";
    }

    @Override
    public void saluer(Personne aSaluer, boolean inclureNom) {
        System.out.println("Salutation m." + (inclureNom ? " "+aSaluer.nom:""));
    }

	@Override
	public double getSalaire() {
		return this.salaire;
	}
}
