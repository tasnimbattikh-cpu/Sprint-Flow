/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie3.ex1;
public class PileInt {
    private int[] tab;
    private int tailleMax;
    private int N;

    public void initialiser(int max) {
        tab = new int[max];
        tailleMax = max;
        N = 0;
    }

    public void afficher() {
        System.out.println("Affichage des éléments de la pile :");
        for (int i = 0; i < N; i++) {
            System.out.println(tab[i] + " ");
        }
    }

    public void empiler(int a) {
        if (N == tailleMax) {
            System.out.println("Opération impossible : pile pleine");
        } else {
            tab[N] = a;
            N++;
        }
    }

    public int depiler() {
        N--;
        return tab[N];
    }

    public int sommet() {
        if (N == 0) {
            System.out.println("Pile vide");
            return -1;
        }
        return tab[N - 1];
    }
}

