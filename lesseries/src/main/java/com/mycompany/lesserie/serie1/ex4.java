
package com.mycompany.lesserie.serie1;

import java.lang.Integer;
import java.lang.Object;

public class ex4 {
    public static void main (String[]args){
        System.out.println("Serie 1 Exercice 4 et 5  operation arithmetique ");
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[2]);
        char c = args[1].charAt(2);
        System.out.println("args[0] :"+ args[0]);
        System.out.println("args[2] :"+ args[2]);
        System.out.println("args[1] :"+ args[1]);
        System.out.println("opérateur :"+c);
        
        switch(c){
            case '+' :
                System.out.println("La somme de "+ a +"+"+b+"="+(a+b));
                break ;
            case '-' :
                System.out.println("La difference "+a+"-"+b+"="+(a-b));
                break ;
            case '*' :
                System.out.println("Le produit "+a+"*"+b+"="+(a*b));
                break ;
             case '/' :
                if (b != 0) {
                    
                    System.out.println("Le quotient réel = " + ((double) a / b)); 
                } else {
                    System.out.println("Erreur : division par zéro !");
                }
                break;

            default:
                System.out.println("Erreur : opérateur invalide !");
        }
    }
}