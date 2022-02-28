package com.company.base;

import java.util.Scanner;

public class Iterative {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while( i < 5) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("salut");
        }

        for (String chaine="OOO"; !chaine.isBlank() ; chaine = scanner.nextLine() ) {
            System.out.println(chaine);
        }


        System.out.println("---- DO ... WHILE ----");
        i = 0;
        do {
            i = Integer.parseInt( scanner.nextLine() );
        }while (i < 10);



    }

}
