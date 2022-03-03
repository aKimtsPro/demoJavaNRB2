package com.company.oo.exo.compet;

import java.util.Comparator;
import java.util.HashMap;

public class Competition<T extends Competiteur> {

    protected HashMap<T, Integer> participants = new HashMap<>();
    private Performance vainqueur;

    public boolean inscrire(T aInscrire){
    	
        if( vainqueur == null && aInscrire != null && !participants.containsKey(aInscrire) ){
            participants.put(aInscrire, null);
            return true;
        }
        return false;
    }

    public boolean desinscrire(T aDesinscrire){
        if( vainqueur == null && aDesinscrire != null && participants.containsKey(aDesinscrire) ){
            participants.remove(aDesinscrire);
            return true;
        }

        return false;
    }

    public Performance lancer(){
        T meilleurSportif = null;
        int scoreMax = 0;

        for (T participant : participants.keySet()) {
            int score = participant.performer();
            participants.put(participant, score);
            if( meilleurSportif == null || scoreMax < score ){
                meilleurSportif = participant;
                scoreMax = score;
            }
        }
        
        onFinish();

        return vainqueur = new Performance(meilleurSportif, scoreMax);
    }
    
    protected void onFinish() {}

    public Performance getVainqueur() {
        return vainqueur;
    }
    
    public Performance getWorstPerformance() {
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
        		.map((p) -> new Performance(p, participants.get(p)))
        		.orElse(null);
    }
    
    private Comparator<T> compareAscScore(){
    	return (p1, p2) -> participants.get(p1) - participants.get(p2);
    }
    
}
