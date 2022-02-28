package com.company.oo.exo.compet;

import com.company.oo.exo.compet.sport.Sportif;

import java.util.HashMap;
import java.util.Random;

public class Competition {

    private HashMap<Sportif, Integer> participants = new HashMap<>();
    private Performance vainqueur;

    boolean inscrire(Sportif aInscrire){
        if( vainqueur == null && aInscrire != null && !participants.containsKey(aInscrire) ){
            participants.put(aInscrire, 0);
            return true;
        }
        return false;
    }

    boolean desinscrire(Sportif aDesinscrire){
        if( vainqueur == null && aDesinscrire != null && participants.containsKey(aDesinscrire) ){
            participants.remove(aDesinscrire);
            return true;
        }

        return false;
    }

    Performance lancer(){
        Sportif meilleurSportif = null;
        int scoreMax = 0;

        for (Sportif participant : participants.keySet()) {
            int score = participant.performer();
            participants.put(participant, score);
            if( meilleurSportif == null || scoreMax < score ){
                meilleurSportif = participant;
                scoreMax = score;
            }
        }

        if(meilleurSportif != null)
            meilleurSportif.setNbrVictoire(meilleurSportif.getNbrVictoire()+1);

        return vainqueur = new Performance(meilleurSportif, scoreMax);
    }

    public Performance getVainqueur() {
        return vainqueur;
    }
}
