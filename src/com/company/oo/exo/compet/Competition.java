package com.company.oo.exo.compet;

import com.company.oo.exo.compet.sport.Individuel;
import com.company.oo.exo.compet.sport.Sportif;

import java.util.HashMap;
import java.util.Random;

public class Competition {

    private HashMap<Individuel, Integer> participants = new HashMap<>();
    private Performance vainqueur;

    boolean inscrire(Individuel aInscrire){
    	if( !(aInscrire instanceof Sportif) )
    		return false;
    	
        if( vainqueur == null && aInscrire != null && !participants.containsKey(aInscrire) ){
            participants.put(aInscrire, 0);
            return true;
        }
        return false;
    }

    boolean desinscrire(Individuel aDesinscrire){
        if( vainqueur == null && aDesinscrire != null && participants.containsKey(aDesinscrire) ){
            participants.remove(aDesinscrire);
            return true;
        }

        return false;
    }

    Performance lancer(){
        Sportif meilleurSportif = null;
        int scoreMax = 0;

        for (Individuel participant : participants.keySet()) {
            int score = participant.performer();
            participants.put(participant, score);
            if( meilleurSportif == null || scoreMax < score ){
                meilleurSportif = (Sportif)participant;
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
