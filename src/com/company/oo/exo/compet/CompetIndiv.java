package com.company.oo.exo.compet;

import com.company.oo.exo.sport.indiv.Individuel;
import com.company.oo.exo.sport.indiv.SportifIndividuel;

public class CompetIndiv<T extends SportifIndividuel> extends Competition<T> {

	@Override
	protected void onFinish() {
		this.participants.keySet().stream()
    	.sorted( (p1, p2) -> participants.get(p2) - participants.get(p1) )
//    	.sorted( this.compareAscScore().reversed() )
//    	.sorted( Comparator.comparingInt(participants::get).reversed() )
    	.limit(3)
    	.forEach(Individuel::incrementNbrVictoire);
	}
	
	public int getTotalWins() {
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
	
}
