/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie3.ex1;
import java.util.Scanner;

public class TestPile {
    public static void main(String[] args) {
        System.out.println("Serie 3 ex 1 empiler , depiler et affichage d'un pile ");
        Scanner sc = new Scanner(System.in);
        PileInt p = new PileInt();

        System.out.println("Saisir la taille maximale :");
        int x = sc.nextInt();
        p.initialiser(x);

        System.out.println("Saisir le nombre d'éléments à empiler :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Saisir un entier :");
            int a = sc.nextInt();
            p.empiler(a);
        }

        p.afficher();
        System.out.println("Le sommet = " + p.sommet());
        p.afficher();
        System.out.println("Dépiler un élément : " + p.depiler());
        p.afficher();
    }
}
