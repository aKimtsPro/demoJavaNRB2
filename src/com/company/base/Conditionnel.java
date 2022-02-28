package com.company.base;

public class Conditionnel {

    public static void main(String[] args) {

        int note = 16;

        if( note >= 10 ){
            System.out.println("C'est réussi");
        }
        else if ( note >= 8 ){
            System.out.println("C'est presque réussi");
        }
        else {
            System.out.println("C'est raté");
        }

        int age = 47;

        switch (age) {
            case 47:
                System.out.print("super");
            case 12:
                System.out.println("ado");
                break;
            case 18:
                System.out.println("adulte");
                break;
            case 40:
                System.out.println("crise");
                break;
            case 62:
                System.out.println("retraite");
                break;
            default:
                System.out.println("pas d'age charnière");
        }

        switch (age) {
            case 47, 12 -> System.out.println("ado");
            case 18 -> System.out.println("adulte");
            case 40 -> System.out.println("crise");
            case 62 -> System.out.println("retraite");
            default -> System.out.println("pas d'age charnière");
        }

    }

}
