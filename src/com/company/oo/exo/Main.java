package com.company.oo.exo;

import com.company.oo.exo.compet.CompetEnEquipe;
import com.company.oo.exo.compet.CompetIndiv;
import com.company.oo.exo.compet.Competition;
import com.company.oo.exo.sport.equipe.Equipe;
import com.company.oo.exo.sport.equipe.JoueurFoot;
import com.company.oo.exo.sport.indiv.Marathonnien;

public class Main {

    public static void main(String[] args) {
    	
    	Competition<Equipe<JoueurFoot>> compet = new CompetEnEquipe<>();
    	
    	Equipe<JoueurFoot> equipe = new Equipe<>("Java FC");
    	equipe.add(new JoueurFoot("Pedroni", "Polo"));
    	equipe.add(new JoueurFoot("Dufrene", "Louis"));
    	equipe.add(new JoueurFoot("Yalounoff", "Serge"));
    	
    	compet.inscrire(equipe);
    	
    	
    	Competition<Marathonnien> compet2 = new CompetIndiv<>();
    	
    	compet2.inscrire(null);
    	
    	System.out.println("machin");
    	
    }

}
