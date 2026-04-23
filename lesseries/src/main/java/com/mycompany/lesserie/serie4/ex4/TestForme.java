/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesserie.serie4.ex4;

public class TestForme {
    public static void main(String[] args) {
        System.out.println("Serie 4 ex 4 la notion d'heritage avec les Forme ");
        Cercle c1 = new Cercle(3.5);
        System.out.println("Surface de c1 = " + c1.surface());

        Carre carre = new Carre(5.0);
        double surfaceCarre = carre.surface();
        double perimetreCarre = carre.perimetre();
        System.out.println("Carré de surface = " + surfaceCarre + " et de périmètre = " + perimetreCarre);
    }
}
