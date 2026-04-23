/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie2.ex5;
import java.util.Scanner;

public class chaine {

    public static void main(String[] arg) {
        System.out.println("Serie 2 ex 5 traiter des chaines de caractéres");
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String texte = sc.nextLine();

        System.out.println("Nombre de mots : " + nbr_mot(texte));

        cons_voy(texte);

        System.out.println("Caractères numériques : " + numerique(texte));

        System.out.println("Message codé : " + codage(texte));

        sc.close();
    }

    public static int nbr_mot(String ch) {
        if (ch == null || ch.trim().isEmpty()) {
            return 0;
        }
        String[] mots = ch.trim().split("\\s+");
        return mots.length;
    }

    public static void cons_voy(String ch) {
        String voyelles = "";
        String consonnes = "";
        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    voyelles += c;
                } else {
                    consonnes += c;
                }
            }
        }
        System.out.println("Voyelles : " + voyelles);
        System.out.println("Consonnes : " + consonnes);
    }

    public static String numerique(String ch) {
        String nums = "";
        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (Character.isDigit(c)) {
                nums += c;
            }
        }
        return nums;
    }

    public static String codage(String ch) {
        char[] tab = ch.toCharArray();
        for (int i = 1; i < tab.length; i += 2) {
            char temp = tab[i];
            tab[i] = tab[i - 1];
            tab[i - 1] = temp;
        }
        return new String(tab);
    }
}
