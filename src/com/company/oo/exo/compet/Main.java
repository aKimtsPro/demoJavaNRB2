package com.company.oo.exo.compet;

import com.company.oo.exo.compet.sport.JoueurFlechette;
import com.company.oo.exo.compet.sport.Judoka;
import com.company.oo.exo.compet.sport.Marathonnien;
import com.company.oo.exo.compet.sport.Sportif;

public class Main {

    public static void main(String[] args) {

        Competition competition = new Competition();

        // Et maintenant un nouveau probleme se dévoile
        Sportif s1 = new Marathonnien("Dudule", "Marc", 71);
        Sportif s2 = new Judoka("Mondine", "Marie", 5);
        Sportif s3 = new JoueurFlechette("Polindon", "Dominique");

        System.out.println("--- AVANT LANCEMENT ---\n");

        System.out.println("inscription s1: "+competition.inscrire(s1));
        System.out.println("inscription s1: "+competition.inscrire(s1));
        System.out.println("inscription s2: "+competition.inscrire(s2));
        System.out.println("desinscription s2: "+competition.desinscrire(s2));
        System.out.println("inscription s2: "+competition.inscrire(s2));
        System.out.println("desinscription s3: "+competition.desinscrire(s3));
        System.out.println("inscription s3: "+competition.inscrire(s3));

        System.out.println("\n--- LANCEMENT ---\n");
        Performance p = competition.lancer();
        System.out.println("Gagnant : "+ p.sportif.getPrenom() +" "+ p.sportif.getNom() + " | score : " + p.score);


        System.out.println("\n--- APRES LANCEMENT ---\n");
        System.out.println("desinscription s3: "+ competition.desinscrire(s3));
        System.out.println("inscription s3: "+ competition.inscrire(s3));
    }

}
