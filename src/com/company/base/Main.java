package com.company.base;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables :

        // entier :

        byte monByte = 2; // 1octet
        short monShort = 252; // 2 octets
        int monInt = 4567502; // 4 octets
        long monLong = 56_871_324_687L; // 8 octets

        // reel :

        float monFloat = 2.1F; // 4 octets
        double monDouble = 2.02; // 8 octets

        // caractère

        char monChar = 'a' + 1;

        // chaine de caractère

        String maChaine = "ma chaine";
        String autreChaine = "ma chaine";

        System.out.println(maChaine == autreChaine); // true

        // boolean

        boolean bool = true;


        // Ecrire/Lire dans la console

        System.out.println("message");

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est votre nom?");
        String nom = sc.nextLine();

        System.out.println("Quel est votre taille?");
        int valeur =  Integer.parseInt( sc.nextLine() );

        System.out.println("Quel est votre prenom?");
        String prenom = sc.nextLine();

        System.out.println("prenom: " + prenom);
        System.out.println("nom: " + nom);
        System.out.println("taille: " + valeur);

        // alexandre\n
        // 190\n


    }
}
