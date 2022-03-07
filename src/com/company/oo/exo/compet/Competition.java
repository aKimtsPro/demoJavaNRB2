package com.company.oo.exo.compet;

import java.util.Comparator;
import java.util.HashMap;

import com.company.oo.exo.exceptions.IllegalParticipantActionException;
import com.company.oo.exo.exceptions.InvalidCompetionStateException;
import com.company.oo.exo.exceptions.NotEnoughParticipantException;

public class Competition<T extends Competiteur> {

    protected HashMap<T, Integer> participants = new HashMap<>();
    private Performance vainqueur;
    
    
    public boolean estTermine() {
    	return vainqueur != null;
    }
    
    public int getNbrInscrit() {
    	return participants.size();
    }
    
    public boolean estInscrit(T participant) {
    	return participants.containsKey(participant);
    }

    public boolean inscrire(T aInscrire){

    	if(isFinished())
    		throw new InvalidCompetionStateException(true);
    	
        if( aInscrire != null && !participants.containsKey(aInscrire) ){
            participants.put(aInscrire, null);
            return true;
        }
     
		throw new IllegalParticipantActionException(aInscrire, true);
    }

    public boolean desinscrire(T aDesinscrire){

    	if(isFinished())
    		throw new InvalidCompetionStateException(true);
    	
        if(aDesinscrire != null && participants.containsKey(aDesinscrire) ){
            participants.remove(aDesinscrire);
            return true;
        }
    	
    	throw new IllegalParticipantActionException(aDesinscrire, false);
    }

    public Performance lancer(){
    	
    	if(isFinished())
    		throw new InvalidCompetionStateException(true);
    	
    	if(participants.size() == 0)
    		throw new NotEnoughParticipantException(1, 0);
    	
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
    	if( !isFinished() )
    		throw new InvalidCompetionStateException(false);
    	
        return vainqueur;
    }
    
    public Performance getWorstPerformance() {
    	if( !isFinished() )
    		throw new InvalidCompetionStateException(false);
    	
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
