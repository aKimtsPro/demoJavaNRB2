package com.company.base;

public class Operateur {

    public static void main(String[] args) {

        int a = 3, b = 2;
        double rslt;

        // arithmétique

        rslt = a + b;
        rslt = a - b;
        rslt = a * b;
        rslt = a / b; // 1
        rslt = (float)a / b; // 1.5
        rslt = a % b;

        // comparaison

        System.out.println( a == b );
        System.out.println( a != b );
        System.out.println( a >= b );
        System.out.println( a > b );
        System.out.println( a <= b );
        System.out.println( a < b );


        // logique

        boolean estVert = true, estLigne = false;

        // AND
        System.out.println( estLigne && estVert );
        // OR
        System.out.println( estLigne || estVert );
        // NOT
        System.out.println( !estVert );

        // loi de De Morgan

        boolean b1 = !(estLigne && estVert);
        b1 = !estLigne || !estVert;

        boolean b2 = !(estLigne || estVert);
        b2 = !estLigne && !estVert;


        // affectation

        a = a + 2;
        a += 2;
        a -= 2;
        a *= 2;
        a /= 2;
        a /= 2.;
        a %= 2;

        a++;

        a = 0;

        System.out.println(a++); // 0
        System.out.println(++a); // 2
        System.out.println(a--); // 2
        System.out.println(--a); // 0


    }

}
