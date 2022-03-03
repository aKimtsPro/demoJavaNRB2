package com.company.oo.exo.sport.indiv;

import java.util.Scanner;

import com.company.oo.exo.sport.Sportif;

public class Judoka extends SportifIndividuel {

    private int equilibre;

    public Judoka(String nom, String prenom, int equilibre) {
        super(nom, prenom);
        this.setEquilibre(equilibre);
    }

    public int getEquilibre() {
        return equilibre;
    }

    public void setEquilibre(int equilibre) {
        if(equilibre <= 10 && equilibre >= -10)
            this.equilibre = equilibre;
    }

    @Override
    public int performer() {
        Scanner sc = new Scanner(System.in);
        int tailleNomTech = sc.nextLine().length();
        return tailleNomTech + getEquilibre();
    }
}
