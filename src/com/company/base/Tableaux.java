package com.company.base;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Tableaux {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int taille = sc.nextInt();

        int[] tabInt = new int[taille];
        int[] tabInt2 = { 1, 2, 3, 4, 5 };
        int[] temp = { tabInt2[0], tabInt2[1], tabInt2[2], tabInt2[3], tabInt2[4], 6 };
        tabInt2 = temp;

        for (int i = 0; i < taille; i++) {
            System.out.println(tabInt[i]);
        }

        String[][] tabChaine1 = new String[5][5];
        String[][] tabChaine2 = new String[5][];

        tabChaine2[0] = new String[5];
        tabChaine2[1] = new String[3];
        tabChaine2[2] = new String[18];
        tabChaine2[3] = new String[1];
        tabChaine2[4] = new String[0];

        String[][] tabChaine3 = { { "1", "2" }, { "3" }, { "4", "5", "6" } };

        // Tableau(2 cases) de tableau(3 cases) de tableau(1 case) de double:
        double[][][] tabD = new double[2][3][1];




        // String[][] tabChaine3 = { { "1", "2" }, { "3" }, { "4", "5", "6" } };
        for (String[] i : tabChaine3) {
            i[0] = "replaced";
        }

        for (String[] i : tabChaine3) {
            for (String s : i) {
                System.out.println(s);
            }
        }

        // Les collections

        System.out.println("--- COLLECTIONS ---");

        ArrayList<String> listChaine = new ArrayList<>();

        listChaine.add("salut");
        listChaine.add("salut");
        listChaine.add("salut");
        listChaine.remove("salut");
        listChaine.remove(0);

        taille = listChaine.size();

        String element = listChaine.get(0);
        if( listChaine.contains("salut") ) {
            System.out.println("salut est contenu");
        }

        for (String s : listChaine) {
            System.out.println(s);
        }
        // salut

        HashMap<String, Integer> map = new HashMap<>();
        map.put( "luc", 54 );
        map.put( "luc", 45 );
        int ageDeLuc = map.get( "luc" );

        System.out.println( map.size() ); // 1
    }

}
