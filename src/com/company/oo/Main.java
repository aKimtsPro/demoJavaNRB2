package com.company.oo;

import com.company.oo.exo.compet.Performance;
import com.company.oo.person.Cadre;
import com.company.oo.person.Employe;
import com.company.oo.person.Ouvrier;
import com.company.oo.person.Personne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // lowerCamelCase // methodes, variables
        // UpperCamelCase // classe, interface, enum, ...
        // lower_snake_case // variable locales
        // UPPER_SNAKE_CASE // constantes

        Random rdm = new Random();
        int rdmNbr = rdm.nextInt(100); // [0;100[ = [0;99]

        Diplome d = new Diplome("secondaire de Machin", "CESS lettres", TypeDiplome.CESS);
        Personne p = new Employe("dubois", "luc", d, "compta");
//        p = new Cadre();

        System.out.println( ((Salarie)p).getSalaire() );
        
        List<Salarie> listSalarie = new ArrayList<>();
        
        listSalarie.add(new Employe("dubois", "luc", d, "compta"));
        listSalarie.add(new Cadre());
        listSalarie.add(new Ouvrier());
        
        for(Salarie s : listSalarie) {
        	s.getSalaire();
        }
        
        p.saluer(p);
        
        Employe e = null;
        if( p instanceof Employe )
        	e = (Employe)p;

    }

}
