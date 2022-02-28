package com.company.oo.exo.compet.sport;

import java.util.Random;

public class JoueurFlechette extends Sportif {
    public JoueurFlechette(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public int performer() { // Ca fonctionne ?
        Random rdm = new Random();
        int i = 0;
        int score= 0;
        while(i++ < 4)
            switch ( rdm.nextInt(4) ){
                case 0:
                    score += 5;
                case 1:
                    score += 10;
                case 2:
                    score += 5;
                case 3:
                    score += 5;
            }

        return score;
    }
}
