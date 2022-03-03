package com.company.oo.exo.compet;

import com.company.oo.exo.compet.sport.Individuel;
import com.company.oo.exo.compet.sport.Sportif;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Competition {

    private HashMap<Individuel, Integer> participants = new HashMap<>();
    private Performance vainqueur;

    boolean inscrire(Individuel aInscrire){
    	if( !(aInscrire instanceof Sportif) )
    		return false;
    	
        if( vainqueur == null && aInscrire != null && !participants.containsKey(aInscrire) ){
            participants.put(aInscrire, null);
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
        
        this.participants.keySet().stream() // TODO: exo 1
        	.sorted( (p1, p2) -> participants.get(p2) - participants.get(p1) )
//        	.sorted( this.compareAscScore().reversed() )
//        	.sorted( Comparator.comparingInt(participants::get).reversed() )
        	.limit(3)
        	.forEach(Individuel::incrementNbrVictoire);

        return vainqueur = new Performance(meilleurSportif, scoreMax);
    }

    public Performance getVainqueur() {
        return vainqueur;
    }
    
    public Performance getWorstPerformance() { // TODO: exo 2
    	if(vainqueur == null)
    		return null;
    	
//    	return participants.keySet().stream()
////    		.sorted((p1, p2) -> participants.get(p1) - participants.get(p2))
//    		.sorted(this.compareAscScore())
//    		.limit(1)
//    		.map((p) -> new Performance((Sportif)p, participants.get(p)))
//    		.findFirst()
//    		.orElse(null);
//    	
    	return participants.keySet().stream()
        		.min(this.compareAscScore()) // Ceci renvoie l'Optional
        		.map((p) -> new Performance((Sportif)p, participants.get(p)))
        		.orElse(null);
    }
    
    public int getTotalWins() { // TODO: exo 3
    	return participants.keySet().stream()
    			.mapToInt(Individuel::getNbrVictoire)
    			.sum();
    	
//    	return participants.keySet().stream()
//    			.collect(Collectors.summingInt(Individuel::getNbrVictoire));

//    	return participants.keySet().stream()
//    			.map(Individuel::getNbrVictoire)
//    			.reduce(0, (acc, next) -> acc += next);

//    	return participants.keySet().stream()
//    			.map(Individuel::getNbrVictoire)
//    			.reduce((acc, next) -> acc += next)
//    			.orElse(0);
    }
    
    private Comparator<Individuel> compareAscScore(){
    	return (p1, p2) -> participants.get(p1) - participants.get(p2);
    }
    
}
