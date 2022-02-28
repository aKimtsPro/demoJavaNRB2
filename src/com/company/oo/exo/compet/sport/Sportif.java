package com.company.oo.exo.compet.sport;

import com.company.oo.exo.compet.Performance;

public abstract class Sportif {

    private String nom;
    private String prenom;
    private int nbrVictoire;

    public Sportif(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract int performer(); // pourquoi pas performance

    public String getNom() {
        return nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNbrVictoire() {
        return nbrVictoire;
    }

    public void setNbrVictoire(int nbrVictoire) {
        this.nbrVictoire = nbrVictoire;
    }
}
