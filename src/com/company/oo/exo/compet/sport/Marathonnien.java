package com.company.oo.exo.compet.sport;

import java.util.Random;

public class Marathonnien extends Sportif {

    private int endurance = 10;

    public Marathonnien(String nom, String prenom, int endurance) {
        super(nom, prenom);
        setEndurance(endurance);
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        if(endurance >= 10 && endurance <= 90)
            this.endurance = endurance;
    }

    @Override
    public int performer() {
        Random rdm = new Random();
        int modifier = rdm.nextInt(21) - 10;
        return getEndurance() + modifier;
    }
}
