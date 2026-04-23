/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie3.ex3;

public class TestEnsembleStr {

    public static void main(String[] args) {
        System.out.println("Serie 3 Ex 3 la gestion d’un ensemble de chaines de caracteres a l’aide d’un tableau de taille fixe.");
        EnsembleStr E1 = new EnsembleStr();
        EnsembleStr E2 = new EnsembleStr();

        E1.ajouter("pomme");
        E1.ajouter("banane");
        E1.ajouter("cerise");
        E1.afficher();

        E2.ajouter("banane");
        E2.ajouter("pomme");
        E2.ajouter("cerise");

        System.out.println("E1 et E2 sont égaux ? " + E1.egalite(E2));

        E1.retirer("banane");
        E1.afficher();

        E1.vider();
        E1.afficher();
    }
}